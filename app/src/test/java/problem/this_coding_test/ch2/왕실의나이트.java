package problem.this_coding_test.ch2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 8 x 8 좌표 평면상에서 나이트의 위치가 주어졌을 때, 나이트가 이동할 수 있는 경우의 수를 구하라.
 * ## 자료
 * - 나이트의 이동
 * >> L자 형태로만 이동, 정원 밖으로 나갈 수 없다.
 * 1. 수평으로 두칸 이동한 뒤에 한 칸 이동하기
 * 2. 수직으로 두칸 동한 뒤에 수평으로 이동하기
 * - 나이트 위치
 * >> 최대 경우의 수는 8이다.
 * <p>
 * ## 조건
 * - 나이트는 정원 밖으로 나갈 수 없다.
 * -
 * <p>
 * ## 계획
 * - 문자열로 입력 받는다.
 * - 좌표를 row와 col 변수로 나눈다.
 * - 나이트가 움직을 수 있는 이동 위치를 만든다.
 * - 나이트가 이동할 수 있는 범위를 만든다.
 * - 해당 위치 이동 가능한다면 카운트 증가한다.
 *
 * <p>
 * ## 반성
 * - bfs, dfs의 문제 유형에서 이동위치랑 똑같다.
 * - 이 문제를 제대로 이해하고 숙달 해야 겠다.
 */

public class 왕실의나이트 {

    public int solution(String str) {

        int row = str.charAt(1) - '0';
        int col = str.charAt(0) - 'a' + 1;

        int[] dx = {-2, 1, -2, -1, 2, 1, 2, -1};
        int[] dy = {1, 2, -1, 2, -1, -2, 1, -2};

        int count = 0;
        for (int i = 0; i < 8; i++) {
            int next_dx = row + dx[i];
            int next_dy = col + dy[i];

            if ((1 < next_dx && next_dx < 8) && (1 < next_dy && next_dy < 8)) { //범위 내에서 이동한다.
                count++;
            }
        }

        return count;
    }

    @Test
    void result() {
        assertThat(solution("a1")).isEqualTo(2);
        assertThat(solution("d4")).isEqualTo(8);
    }

}
