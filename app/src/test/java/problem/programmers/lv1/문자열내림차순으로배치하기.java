package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하라.
 *
 * ## 자료
 * - 문자를 큰것부터 작은 순으로 정렬
 *  >> 알파벳순으로 내림차순 정렬하기
 *
 * ## 조건
 * - 대문자는 소문자보다 작은 것으로 간주
 * - str은 길이 1 이상인 문자열입니다.
 *
 * ## 계획
 * - 문자열을 입력 받는다.
 * - 문자열 내림차순으로 정렬한다.
 * - 내림차순으로 정렬된 문자열을 반환한다.
 *
 * ## 반성
 * -
 * -
 *
 */

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }

    public String solution1(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr, 0, arr.length));

        return sb.reverse().toString();
    }

//    @Test
//    void result() {
//        assertThat(solution("Zbcdefg")).isEqualTo("gfedcbZ");
//    }

    @Test
    void result1() {
        assertThat(solution1("Zbcdefg")).isEqualTo("gfedcbZ");
    }
}
