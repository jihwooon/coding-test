package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 정수 n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴하라.
 * ## 자료
 * - 정수 n
 * >> long 형
 * - 큰것부터 작은 순
 * >> 내림차순
 * <p>
 * ## 조건
 * - n은 1이상 8000000000 이하인 자연수
 * <p>
 * ## 계획
 * - 정수 n을 입력받는다.
 * - 정수를 배열로 나열한다.
 * - 큰 수부터 배열로 나열한다.
 * - 배열을 정수 형태로 반환한다.
 * <p>
 * ## 반성
 * - 정수를 내림차순으로 변환 시킬 수 있는 방법을 생각해봐야겠다.
 * - 문자열을 사용해도 StringBuffer나 StringBuilder에 대해서 공부를 해봐야겠다.
 */

public class 정수내림차순으로배치하기 {

    public long solution(long n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        String sb = new StringBuilder(new String(chars)).reverse().toString();

        return Long.parseLong(sb);
    }

    @Test
    void result() {
        assertThat(solution(118372)).isEqualTo(873211);
    }
}
