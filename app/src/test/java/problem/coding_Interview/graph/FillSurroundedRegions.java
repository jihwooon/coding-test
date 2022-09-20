package problem.coding_Interview.graph;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * ## 미지의 것
 * 2차원 배열 A는, W 혹은 B로 구성이되어 있다면, A가 주어졌을 때 경계 지점에 도달할 수 없는 모든 W를 B로 바꾸는 프로그램을 작성하라.
 * ## 자료
 * - 2차원 배열
 * >> M x N 으로 이뤄어진 배열
 * >> Graph(인접 행렬)로 표현 할 수 있다.
 * -
 * <p>
 * ## 조건
 * -
 * -
 * <p>
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class FillSurroundedRegions {
    public static class Coordinate {
        public Integer x;
        public Integer y;

        public Coordinate(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void markBoundaryRegion(int i, int j, List<List<Character>> board) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(i, j));

        while (!queue.isEmpty()) {
            Coordinate curr = queue.poll();

            if (curr.x >= 0 && curr.x < board.size() &&
                curr.y >= 0 && curr.y < board.get(curr.x).size() &&
                board.get(curr.x).get(curr.y) == 'W') {

                // 상, 하, 좌, 우의 위치도 모두 표현
                board.get(curr.x).set(curr.y, 'T');
                queue.add(new Coordinate(curr.x - 1, curr.y));
                queue.add(new Coordinate(curr.x + 1, curr.y));
                queue.add(new Coordinate(curr.x, curr.y - 1));
                queue.add(new Coordinate(curr.x, curr.y + 1));
            }
        }
    }

    // 첫 번째 또는 마지막 열에서 시작해서 흰색 경로를 통해 도달 가능한 지역을 찾는다.
    public static void fillSurroundedRegions(List<List<Character>> board) {

        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).get(0) == 'W') {
                markBoundaryRegion(i, 0, board);
            }
            if (board.get(i).get(board.get(i).size() - 1) == 'W') {
                markBoundaryRegion(i, board.get(i).size() - 1, board);
            }
        }

        for (int j = 0; j < board.get(0).size(); j++) {
            if (board.get(0).get(j) == 'W') {
                markBoundaryRegion(0, j, board);
            }
            if (board.get(board.size() - 1).get(j) == 'W') {
                markBoundaryRegion(board.size() - 1, j, board);
            }
        }

        for (int i = 0; i < board.size(); ++i) {
            for (int j = 0; j < board.get(i).size(); ++j) {
                board.get(i).set(j, board.get(i).get(j) != 'T' ? 'B' : 'W');
            }
        }
    }

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(4, 4);


    }
}
