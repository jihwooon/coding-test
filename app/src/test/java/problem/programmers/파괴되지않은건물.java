package problem.programmers;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ## 미지의 것
 * 2차원 정수 배열 board, 2차원 정수 배열 skill, 중 적의 공격 혹은 아군 회복 모두 끝낸 후 파괴되지 않은 건물의 갯수를 구하라.
 * ## 자료
 * <p>
 * - 적의 공격 ([type, r1, c1, r2, c2, degree])
 * >> 공격을 받으면 내구도가 하락한다.
 * >> type 1
 * >> degree 만큼 내구도를 낮춘다.
 * - 아군 회복
 * >> 회복은 하면 내구도가 상승한다.
 * >> type 2
 * >> degree 만큼 내구도를 획복한다.
 * <p>
 * ## 조건
 * - skill의 열의 길이 = 6
 * - [type, r1, c1, r2, c2, degree]
 * <p>
 * <p>
 * ## 계획
 * -
 * -
 * <p>
 * ## 반성
 * -
 * -
 */

public class 파괴되지않은건물 {
    static int N, M;

    public int solution(int[][] board, int[][] skill) {
        int answer = 0;
        int count = 0;

        for (int[] b : board) {
            for (int c : b) {
                if (skill[0][0] == 1) { // type 1
                    answer = c - skill[0][5];
                    System.out.println("answer = " + answer);

                } else { // type 2
                    answer = c + skill[0][skill.length];
                }


                //결과값이 0 이상이면 count 한다.
                if (answer > 0) {
                    count++;
                }
            }
        }

        return count;
    }

    @Test
    void result() {
        assertThat(solution(new int[][]{{5}}, new int[][]{{1, 0, 0, 0, 0, 5}})).isEqualTo(0); // 파괴된 상태
//        assertThat(solution(new int[][]{{5}}, new int[][]{{1, 0, 0, 0, 0, 4}})).isEqualTo(1); // 파괴되지 않은 상태
//        assertThat(solution(new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 0, 0, 0, 0, 2}, {1, 1, 1, 1, 1, 3}, {1, 1, 1, 1, 1, 2}})).isEqualTo(5); // 파괴되지 않은 상태

    }
}
