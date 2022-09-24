package problem.remommendation.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/** 3-1 거스름돈
 * ## 미지의 것
 * 거슬러 줘야 할 돈이 N원일 때, 거슬러줘야 할 동전의 최소 개수를 구하라.

 * ## 자료
 * - N원
 *  >> 손님에게 거슬러 줘야 할 돈
 * - 동전
 *  >> 거스름돈 500원, 100원, 50원, 10원
 *
 * ## 조건
 * - 거슬러 줘야 할 돈 N은 항상 10배수이다.
 *
 * ## 계획
 * - 거슬러 줘야 할 돈을 입력 받는다.
 * - 거슬러줘야 할 동전 500, 100, 50, 10을 배열에 나열한다.
 * - 동전을 N원에 센다.
 * - 동전의 개수를 나눈 후 센다.
 * - 동전의 개수를 나눈 수의 값을 반환한다.
 *
 * ## 반성
 * - "/" 와 "%" 두 개가 아직도 헷갈린다.
 * - 문제에 좀 더 집중을 해야 겠다.
 *
 */
public class 거스름돈 {

    public int solution(int n, int ... coins) {
        int minNumber = 0; // 최소값
        for(int coin : coins) {
            minNumber += n / coin;
            n %= coin;

        }

        return minNumber;
    }

    @Test
    void result() {
        assertThat(solution(1260, 500,100,50,10)).isEqualTo(6);
    }
}
