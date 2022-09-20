package problem.this_coding_test.ch3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

// 인접 행렬 방식
public class AdjacencyMatrix {

    public int[][] adjacencyMatrix(int[][] graph) {

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println("graph = " + Arrays.deepToString(graph) + "");
        return graph;
    }

    @Test
    void result() {
        assertThat(adjacencyMatrix(new int[][]{{0, 7, 5}, {7, 0, 0}, {5, 0, 0}})).isEqualTo(new int[][]{{0, 7, 5}, {7, 0, 0}, {5, 0, 0}});
    }
}
