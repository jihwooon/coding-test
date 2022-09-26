package problem.this_coding_test.ch2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 정수 N이 입렫되면 모든 시각 중에서 3이 하나라도 포함이 되는 모든 경우의 수를 구하라.
 * ## 자료
 * -모든 시각
 * >> 00시 00분 00초 부터 N시 59분 59초
 * ## 조건
 * - 3이 하나도 포함되어 있지 않으면 안된다.
 * ## 계획
 * - 정수를 입력 받는다.
 * - i ~ n + 1 수를 반복한다.
 * - j ~ 60 까지 수를 반복한다.
 * - k ~ 60 까지 수를 반복한다.
 * - 3이 하나라도 포함이 되어 있으면 경우의 수를 출력한다.
 * <p>
 * ## 반성
 * - 3이라는 숫자를 boolean 을 통해 확인 할 수 있는 메소드를 만드는것을 알게 되었다.
 * - 여러번 문제를 풀어봐야 겠다.
 */

public class 시각 {

    public int solution(int n) {
        int count = 0;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) count++;
                }
            }
        }
        return count;
    }

    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s % 10 == 3 || s / 10 == 3) {
            return true;
        }
        return false;
    }

    @Test
    void result() {
        assertThat(solution(5)).isEqualTo(11475);
    }

}
