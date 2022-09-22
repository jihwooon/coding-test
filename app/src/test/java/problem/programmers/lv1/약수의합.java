package problem.programmers.lv1;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 구하라.
 * ## 자료
 * - 약수
 * >> 어떤 수를 나누어떨어지게 하는 수
 * ex) 12의 약수는 1, 2, 3, 4, 6, 12
 * <p>
 * ## 조건
 * - 약수가 아닌 수가 나와서는 안된다.
 * - n은 0 이상 3000 이하인 정수이다.
 * <p>
 * ## 계획
 * - 정수 n을 입력 받는다.
 * - n의 약수를 구한다.
 * - n의 약수의 합을 구한다.
 * - 합을 반환한다.
 * <p>
 * ## 반성
 * - for문에서 0 ~ n까지 반복을 하는데 실패를 했다.
 * - 0이 아닌 1로 해야 정상적으로 작동 했다.
 * - 0부터 시작인 경우 ArithmeticException 에러가 발생하는데 왜 발상하는지 알아 봐야 겠다.
 */

public class 약수의합 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    @Test
    public void result() {
        assertThat(solution(12)).isEqualTo(28);
    }
}
