package problem.remommendation.ch1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 카드들 N x M 형태로 놓여 있을 때, 게임의 룰에 맞게 카드를 뽑는 프로그램을 작성하라.
 * ## 자료
 * - 카드들 N x M
 * >> N은 행의 개수, M은 열의 개수
 * - 게임의 룰
 * >> 1. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
 * >> 2. 그 다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 한다.
 * >> 3. 처음에 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려하여
 * 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있게 전략을 세워야 한다.
 * ## 조건
 * - 행의 개수 N과 열의 개수 M이 각각 자연수로 주어진다.
 * <p>
 * ## 계획
 * - 카드 N x M 형태의 2차원 행렬 배열을 만든다.
 * - 반복문을 사용해서 각 행의 가장 작은 수를 찾는다.
 * - 각 행의 최소값 중 최대값을 반환한다.
 * <p>
 * ## 반성
 * - 처음에는 Integer.MIN_VALUE 을 사용했다. 최소값이라고 해서 나는 최소값을 주면 되는 줄 알았다.
 * - 답을 확인 해보니 Integer.MAX_VALUE 을 사용했다. 왜 그런지 고민 해봐야겠다.
 *  - for문 안에 minValue 변수가 저장 되는 방식을 이해해야겠다.
 */

public class 숫자카드게임 {

    public int solution(int[][] graph) {
        int row = graph.length;
        int cal = graph[0].length;
        int result = 0;

        for (int i = 0; i < row; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < cal; j++) {
                minValue = Math.min(minValue, graph[i][j]);
            }
            result = Math.max(result, minValue);
        }

        return result;
    }

    @Test
    void result() {

        assertThat(solution(new int[][]{
                {3, 1, 2},
                {4, 1, 4},
                {2, 2, 2}
        })).isEqualTo(2);
    }
}
