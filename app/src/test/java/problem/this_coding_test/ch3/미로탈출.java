package problem.this_coding_test.ch3;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 미로 안에 미로 출구로 나가기 위해 움직여야 하는 최소 칸의 개수를 구하라.
 * ## 자료
 * - 미로
 * >> N x M 크기의 직사각형
 * - 미로 출구
 * >> (N, M)
 * -
 * ## 조건
 * - 시작 칸과 마지막 칸은 항상 1이다.
 * - 두 정수 N, M(4 <= N, M <= 200)
 * ## 계획
 * -
 * -
 *
 * ## 반성
 * -
 * -
 *
 */
public class 미로탈출 {
    public static int row; //열
    public static int cal; //행
    public static int [] dx = {-1, 1, 0, 0}; // 상하좌우 x 방향
    public static int [] dy = {0, 0, -1, 1}; // 상하좌우 x 방향
    public static boolean [][] visited; //방문 표시

    public int solution(int [][] graph) {
        int minCount = 0;
        row = graph.length;
        cal = graph[0].length;
        visited = new boolean[row][cal];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < cal;  j++) {
                if(graph[i][j] == 0 && visited[i][j] == true ) {
                    visited[i][j] = true;
                    bfs(i, j, graph);
                }
            }
            return 0;

        }

        return minCount;
    }

    public static int inSide(int x, int y) {
        if(x >= 0 && x < row && y >= 0 && y < cal) {
            return 0;
        }

        return 1;
    }

    public static void bfs(int x, int y, int[][] graph) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(x);
        queue.offer(y);

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(inSide(nx, ny) == 0 && visited[nx][ny] == true && graph[nx][ny] == 0) {
                visited[nx][ny] = true;
                bfs(nx,ny, graph);
            }
        }

    }

    @Test
    void result() {
        assertThat(solution(new int[][] {
                {1,1,0},
                {0,1,0},
                {0,1,1}
        })).isEqualTo(5);
    }
}
