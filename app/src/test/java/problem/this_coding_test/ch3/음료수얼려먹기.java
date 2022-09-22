package problem.this_coding_test.ch3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 얼음 틀의 모양이 주어졌을 때, 생성되는 총 아이스크림의 개수를 구하라.
 * ## 자료
 * - 얼음 틀
 *  >> N X M의 2차원 리스트 맵
 * - 아이스크림
 *  >> 상, 하, 좌, 우 구멍이 뚫려 있는 0 영역
 * <p>
 * ## 조건
 * - 구멍이 뚤려 있는 0이 1을 넘어가선 안된다.
 * - 구멍이 뚫려 있는 부분끼리 상, 하, 좌, 우 붙어 있는 경우를 서로 연결되어 있는 것으로 간주한다.
 * - N과 M의 크기는 (1 <= N,M <= 1,000)
 * - 방문 한 곳이 false 인 경우 true 표시를 해준다.
 * <p>
 * ## 계획
 * 1. N x M의 2차원 리스트의 맵을 생성한다.
 * 2. 2차원 리스트의 맵 정보 입력 받는다. ex) 00011 11100 11111 00000
 * 3. x,y가 -1 이상 이고 x > n, y > m을 넘어가면 false 종료 한다.
 * 4. x,y가 0인 경우 상, 하, 좌, 우를 방문 하고 true 표시합니다.
 * 5. 현재 노드가 true 인 경우 아이스크림 개수를 추가합니다.
 * 6. 아이스크림 총 개수를 반환합니다.
 *
 * <p>
 * ## 반성
 * - 이 문제에서 중요한 몇 가지가 있다.
 *  1. 행과 열을 구분하는 것
 *  2. 상, 하, 좌, 우를 구분한다.
 *  3. 방문한 자리를 체크하는 배열을 생성해야 한다.
 *  4. 조건이 중요하다.
 * -
 */

public class 음료수얼려먹기 {
    public static int row;
    public static int cal;
    public static boolean[][] visited;
    public static int dx [] = {0,0,-1,1};
    public static int dy [] = {-1,1,0,0};

    public int solution(int [][] map) {
        int iceCream = 0;
        row = map.length;
        cal = map[0].length;
        visited = new boolean[row][cal];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < cal; j++) {
                if(map[i][j] == 0 && visited[i][j] == false) { // map이 0 이고, 방문한 곳이 false 인 경우에
                    visited[i][j] = true; // 방문을 true 변환
                    dfs(i,j, map);
                    iceCream += 1;
                }
            }
        }

        return iceCream;
    }

    public boolean isInside(int x, int y) { //내부 방문 확인

        if(x >= 0 && x < row && y >=0 && y < cal) {
            return true;
        }

        return false;
    }

    public void dfs(int x, int y, int[][] map) {

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(isInside(nx, ny) && map[nx][ny] == 0 && visited[nx][ny] == false) {// 조건이 만족 할 때만 방문한다.
                visited[nx][ny] = true;
                dfs(nx,ny, map);
            }
        }
    }



    @Test
    void result() {
        assertThat(solution(new int[][]{
                {0,0,0,0,0},
                {0,1,0,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
        })).isEqualTo(2);
    }
}
