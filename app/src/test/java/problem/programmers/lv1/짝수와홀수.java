package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 * ## 자료
 * - 짝수
 * >> 0,2,4,6,8,10,...
 * - 홀수
 * >> 1,3,5,7,9,11...
 * ## 조건
 * - num은 int 범위의 정수입니다
 * - 0은 짝수입니다.
 * <p>
 * ## 계획
 * - 정수를 입력 받는다.
 * - 정수가 짝수의 수를 입력 받았을 경우 "Odd"를 리턴한다.
 * - 정수가 홀수의 수를 입력 받았을 경우 "Even"을 리턴한다.
 * - 단 0도 짝수로 리턴한다.
 * ## 반성
 * - 삼항연산자로도 풀 수 있다는 것을 나중에 알 았습니다.
 * - % 를 알고 있으면 문제 푸는데 많은 도움이 된다.
 */

public class 짝수와홀수 {

    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0 || num == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution(2)).isEqualTo("Even");
        assertThat(solution(3)).isEqualTo("Odd");
    }

}
