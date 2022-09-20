package problem.this_coding_test.ch3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ## 미지의 것
 * <p>
 * ## 자료
 * -
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

public class 음료수얼려먹기 {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        //2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
                System.out.println("graph = " + Arrays.deepToString(graph));
            }
        }
        sc.close();

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j) == true) {
                    result += 1;
                }
            }
        }
        System.out.println("result = " + result);
    }

    // dfs로 특정 노드를 방문하고 상하좌우로 연결된 모든 노드들도 방문
    public static boolean dfs(int x, int y) {

        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }

        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }

        return false;
    }

}
