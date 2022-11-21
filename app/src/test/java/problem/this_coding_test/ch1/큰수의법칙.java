package problem.this_coding_test.ch1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 배열의 크기N, 숫자가 더해는 횟수M, 그리고 K가 주어질 때 큰 수의 법칙에 따른 결과를 출력하라.
 *
 * ##자료
 * - 배열의 크기 n
 * - 더해지는 횟수 M
 * - 큰수를 k만큼 연속해서 더할 수 있다.
 *
 * */

public class 큰수의법칙 {

    public int solution(int m, int k, int ... arr) {
        int result = 0;
        Arrays.sort(arr);

        int first = arr[arr.length - 1];
        int second = arr[arr.length - 2];

        while(m != 0) {
            for(int i = 0; i < k; i++) {
                result += first;
                m--;
            }
            result += second;
            m--;
        }

        return result;
    }

    @Test
    void result() {
        assertThat(solution(8,3, 2,4,5,4,6)).isEqualTo(46);
    }
}
