package problem.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 *  배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하라
 * ## 자료
 * - 베열 arr
 *  >> 각 원소 안에 숫자 0 ~ 9까지 이루어져 있다.
 *
 * ## 조건
 * - 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 한다.
 * - 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 *
 * ## 계획
 * - arr 배열을 입력 받는다.
 * - num 초기값을 설정한다
 * - for문안에서 배열이 같은 숫자가 아니면 list에 저장되게 한다.
 *
 * ## 반성
 * - num 변수가 for문 안에서 어떻게 되고 왜 if()문에서 초기값이 변경 되는지 이해 해야겠다.
 *
 */

public class 같은숫자는싫어 {

    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};

        int num = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }

        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution(new int[]{1,1,3,3,0,1,1})).isEqualTo(new int[] {1,3,0,1});
    }
}
