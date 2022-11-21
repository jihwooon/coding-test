package problem.this_coding_test.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 거스름돈 {

    public int solution(int x, int ...coins) {
        int result = 0;

        for(int i = 0; i < 4; i++) {
            result += x / coins[i];
            x %= coins[i];
        }

        return result;
    }

    @Test
    void result() {
        assertThat(solution(1260, 500,100,50,10)).isEqualTo(6);
    }
}
