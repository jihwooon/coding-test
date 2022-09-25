package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 자연수 N이 주어지먄, N의 각 자리수의 합을 구해서 return 하라.
 * ## 자료
 * - 자연수 N
 * - N의 각 자리수의 합
 *  >> 123 = 1 + 2 + 3
 *
 * ## 조건
 * - N의 범위
 *
 * ## 계획
 * - 자연수 n을 입력 받는다.
 * - 자연수 n을 문자열로 변환한다.
 * - 문자열을 char 배열로 담아준다.
 * - char 배열을 센다.
 * - answer의 합을 구한다.
 *
 * ## 반성
 * - int형의 자릿수를 구하는 방법을 찾아본다.
 * - 문자열이 아니여도 다른 방법으로 찾아 볼 수 있을거다.
 *
 */

public class 자릿수더하기 {

    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            answer += chars[i] - '0';
        }

        return answer;
    }

    @Test
    void result() {

        assertThat(solution(123)).isEqualTo(6);
    }
}
