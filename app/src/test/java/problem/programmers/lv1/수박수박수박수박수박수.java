package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하라.
 * ## 자료
 * - 수박수박수박수....와 같은 패턴유지하는 문자열
 *  >>
 * ## 조건
 * - n은 길이 10,000이하인 자연수입니다.
 */

public class 수박수박수박수박수박수 {

    public String solution(int n) {
        String answer = "";

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                answer += "수";
            } else if(i % 2 == 1){
                answer += "박";
            }

        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution(3)).isEqualTo("수박수");
    }

}
