package problem.programmers.lv2;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
 * 각 배포마다 몇 개의 기능이 배포되는지를 return 하라.
 * <p>
 * ## 자료
 * - 작업의 진도
 * >> 기능 완성도
 * - 작업의 개발 속도
 * >> 개발 진도율
 * - 기능이 배포 개수
 * >> 작업을 마치고 배포의 개수
 * <p>
 * ## 조건
 * - 완성이 되었더라도 앞에 있는 기능이 완성이 되어 있지 않으면 배포가 불가능하다.
 * >>첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
 * >> 첫번째 배포가 7일이고 두번째 배포가 3일이면 배포 개수는 첫번째 배포에 포함이 된다.
 * - 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
 * - 작업 진도 100미만의 자연수 입니다.
 * - 작업 속도는 100 이하이 자연수 입니다.
 * <p>
 * ## 계획
 * - progresses 와 speeds 배열을 입력 받는다.
 * - 작업이 개발 되는데 필요한 기간 = (100 - 작업의 진도) / 개발 진도율 계산한다.
 * - /의 나머지를 버리고 반올림 한다.
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        // 기능이 배포 개수 구하기
        for (int i = 0; i < progresses.length; i++) {
            queue.offer((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }
        
        int count = 1; // 배포 갯수
        int FrontDistribution = queue.poll();
        while (!queue.isEmpty()) {
            if(FrontDistribution < queue.peek()) {
                list.add(count);
                count = 1;
                FrontDistribution = queue.poll();
            } else {
                count++;
                queue.poll();
            }
        }
        list.add(count);


        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    @Test
    void result() {
        assertThat(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})).isEqualTo(new int[]{2, 1});
    }
}
