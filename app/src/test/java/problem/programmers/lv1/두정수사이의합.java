package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 두 정수 a,b가 주어졌을 때, a와 b 사이에 속한 모든 정수의 합을 구하라.
 * ## 자료
 * - a와 b 사이의 정수
 *  >> 3과 8 사이의 정수 4,5,6,7
 *
 * ## 조건
 * - a와 b가 같은 경우 둘 중 아무 수나 리턴하라.
 *
 * ## 계획
 * - a, b 두 수를 받는다.
 * - a ~ b 사이의 수를 루프문으로 반복한다.
 * - 사이의 모든 값을 더한다.
 *
 * ## 반성
 * - 시작 하는 수를 a로 부터 아이디어가 떠올라서 생각 외로 쉬웠다.
 * - 재귀적인 생각으로 풀 수 있을 것 같다.
 */
public class 두정수사이의합 {

    public long solution(int a, int b) {
        long answer = 0;

        if(a < b) {
            for (long i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (long j = b; j <= a; j++) {
                answer +=j;
            }
        }
        return answer;
    }

    public long solution1(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) /2;
    }

    @Test
    void result() {
        assertThat(solution(3,5)).isEqualTo(12);
        assertThat(solution(3,3)).isEqualTo(3);
    }

    @Test
    void solution1() {
        assertThat(solution1(3,5)).isEqualTo(12);
        assertThat(solution1(3,3)).isEqualTo(3);
    }
}
