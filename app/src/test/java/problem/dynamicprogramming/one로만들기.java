package problem.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * [백준] 1463 - 1로 만들기
 * ## 미지의 것
 * 정수 N이 주어졌을 때, 같은 여사 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하라.
 * <p>
 * ## 자료
 * - n가 3으로 나누어 떨어지면, 3으로 나눈다.
 * - n가 2로 나누어 떨어지면 2로 나눈다.
 * - 1을 뺀다.
 * - 1이 된다.
 * ## 조건
 * - 1보다 크거나 같고 10^6보다 작거나 같은 정수다.
 * <p>
 * ## 계획
 * - n이 1보다 크거나 10^6보다 작은 정수를 입력 받는다.
 * - x % 3이 나누어 떨어지는 경우 3으로 나눈다.
 * - x % 2로 나누어 떨어지는 경우 2로 나눈다.
 * - 1을 뺀다.
 * ## 반성
 * - 왜 이 문제는 메모이제이션으로 풀어야 하는지 궁금하다.
 * - dp로 어떻게 풀어야 할 지 생각해봐야겠다.
 */
public class one로만들기 {


    public int solution(int n) {

        int count = 0;
        while (n >= 1) {
            if (n % 3 == 0) {
                n /= 3;
                count += 1;
            }

            if (n % 2 == 0) {
                n /= 2;
                count += 1;
            }
            n -= 1;
            count += 1;
        }

        while (n > 1) {
            n -= 1;
            count += 1;
        }

        return count;
    }

    public int recur(int n, int count) {
        if (n < 2) {
            return count;
        }

        return Math.min(recur(n / 2, count + 1 + (n % 2)), recur(n / 3, count + 1 + (n % 3)));
    }

    @Test
    void result() {
        assertThat(solution(2)).isEqualTo(1);
        assertThat(solution(10)).isEqualTo(3);
        assertThat(recur(2, 0)).isEqualTo(1);
        assertThat(recur(5, 0)).isEqualTo(3);
        assertThat(recur(10, 0)).isEqualTo(3);
    }

}
