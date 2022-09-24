package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인하라.
 * ## 자료
 * - 숫자로만 구성 되어 있으면 true
 * - 문자열이 있으면 false
 *
 * ## 조건
 * - 이상, 길이 8 이하인 문자열입니다.
 * - 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
 *
 * ## 계획
 * - 문자열을 받는다.
 * - 문자가 포함이 되어 있으면 false를 반환한다.
 * - 숫자만 있으면 true를 반환한다.
 *
 *
 * ## 반성
 * -
 * -
 *
 */

public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;

        char[] temp = s.toCharArray();
        if(temp.length != 4 && temp.length != 6) {
            return false;
        }

        for(int i = 0; i < temp.length; i++) {
            if(!(temp[i] >= '0' && temp[i]<='9')) {
                answer = false;
            }
        }
        return answer;
    }

    @Test
    void result() {

        assertThat(solution("a234")).isFalse();
        assertThat(solution("1234")).isTrue();
    }
}
