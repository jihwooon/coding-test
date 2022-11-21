package problem.this_coding_test.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 손님에게 거슬러 줘야 할 돈이 N원일 대 거슬러 줘야 할 동전의 최소 개수를 구하라.
 *
 * ## 조건
 * 500, 100, 50, 10
 *
 * ## 계획
 * 1. N이 1260을 가정한다.
 * 2. 500, 100, 50, 10을 배열로 담는다.
 * 3. 화폐를 거슬러 줄 수 있는 동전의 개수를 센다.
 * 4. 최소의 개수를 구한다
 *
 * ## 반성
 * 오랜만에 풀어보니까 어떻게 풀어야 할 지 생각이 안난다.
 * 매일 조금씩 풀어봐야겠다.
 * */

public class 거스름돈 {

    public int solution(int n, int ...coins) {
        int result = 0;

        for(int i = 0; i < coins.length; i++) {
            result += n / coins[i];
            n %= coins[i];
        }

        return result;
    }

    @Test
    void result() {
        assertThat(solution(1260, 500,100,50,10)).isEqualTo(6);
    }
}
