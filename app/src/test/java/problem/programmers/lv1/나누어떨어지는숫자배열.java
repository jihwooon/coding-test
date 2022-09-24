package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하라.
 * ## 자료
 * -
 * -
 * <p>
 * ## 조건
 * -
 * -
 * <p>
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                count++;
                System.out.println("count = " + count);
            }
        }

        if(count == 0) {
            int [] answer = {-1};
            return answer;
        }

        int [] answer = new int[count];

        for(int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[j++] = arr[i];
            }
        }

        Arrays.sort(answer);

        return answer;
    }

    @Test
    void result() {
        assertThat(solution(new int[]{5,9,7,10}, 5)).isEqualTo(new int[]{5,10});
    }

}
