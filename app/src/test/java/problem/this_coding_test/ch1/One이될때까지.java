package problem.this_coding_test.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

/**
 * ## 미지의 것
 * N과 K가 주어질 때, N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하라.
 * ## 자료
 * - N과 K는 자연수
 * - 1번 과정
 * >> N에서 1을 뺀다.
 * - 2번 과정
 * >> N을 K로 나눈다.
 * <p>
 * ## 조건
 * - N은 항상 K보다 크거나 같다.
 * - N(2 <= N <= 100,000)과 K(2 <= K <= 100,000)
 * <p>
 * ## 계획
 * - N과 K를 입력 받는다.
 * - N이 K로 나누어 떨어질 때의 1번 조건과 2번 조건 만든다.
 * - N이 1이 될 때까지 1번 혹은 2번 과정을 반복한다.
 * - 전체 과정의 실행 횟수를 반환한다.
 * <p>
 * ## 반성
 * - 문제를 보고 빠르게 발상이 안 떠오른다.
 * - while문에 익숙 하지가 않아서 while 또는 for문, 재귀 적으로 생각 해봐야겠다.
 */

public class One이될때까지 {

    public int solution(int n, int k) {

        int count = 0;
        while (n >= k) {

            while (n % k != 0) {
                n -= 1;
                count += 1;
            }
            n /= k;
            count += 1;
        }

        while(n > 1) {
            n -= 1;
            count += 1;
        }


        return count;
    }

    @Test
    void result() {
        assertThat(solution(25, 5)).isEqualTo(2);
    }
}
