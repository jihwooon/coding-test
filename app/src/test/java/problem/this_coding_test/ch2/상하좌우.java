package problem.this_coding_test.ch2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 계획서가 주어졌을 때 여행가 A가 최종적으로 도착할 지점의 좌표를 출력하는 프로그램을 작성하라.
 * ## 자료
 * - 계획서
 * >> L, R, U, D 중 하나의 문자가 반복적으로 적혀 있다.
 * * L : 왼쪽으로 한 칸 이동
 * * R : 오른쪽을 한 칸 이동
 * * U : 위로 한 칸 이동
 * * D : 아래로 한 칸 이동
 * - N x N 크기의 정사각형
 * - 왼쪽 좌표 (1, 1)
 * - 가자 오른쪽 좌표 (N, N)
 * <p>
 * ## 조건
 * - 정사격형 공간을 벗어나는 움직임은 무시가 된다.
 * <p>
 * ## 계획
 * - n x n 크기의 정사각형 배열을 만든다.
 * - 시작 좌표를 만든다.
 * - 상하좌우 방향을 만들어준다.
 * -
 * <p>
 * ## 반성
 * - 아직도 좌표 관려 문제은 어렵다. 특히 벗어나는 조건은 아직도 모르겠다.
 * - 상하좌우는 이제는 알겠는데 그 외는 어떻게 할지 아직 계획이 안 세워진다.
 */

public class 상하좌우 {

    public String solution(int n, String... plans) {
        int x = 1;
        int y = 1;

        // 상하좌우
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] move_type = {'L', 'R', 'U', 'D'};

        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            int nx = -1;
            int ny = -1;

            for (int j = 0; j < 4; j++) {
                if (plan == move_type[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            if (nx < 1 || ny < 1 | nx > n || ny > n) {
                continue;
            }

            x = nx;
            y = ny;

        }

        String x_d = String.valueOf(x);
        String y_d = String.valueOf(y);

        String sb = x_d + " " + y_d;
        return sb;
    }

    @Test
    void result() {

        assertThat(solution(5, "R", "R", "R", "U", "D", "D")).isEqualTo("3 4");
    }

}
