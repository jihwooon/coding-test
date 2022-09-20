package problem.coding_Interview.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphBootCamp {
    public static class MathResult {
        public String winningTeam;
        public String losingTeam;

        public MathResult(String winningTeam, String losingTeam) {
            this.winningTeam = winningTeam;
            this.losingTeam = losingTeam;
        }
    }

    public static boolean canTeamABeatTeamB(List<MathResult> matches, String teamA, String teamB) {
        Set<String> visited = new HashSet<>();
        return isReachableDFS(buildGraph(matches), teamA, teamB, visited);
    }

    public static Map<String, Set<String>> buildGraph(List<MathResult> matches) {
        HashMap<String, Set<String>> graph = new HashMap<>();

        for (MathResult match : matches) {
            Set<String> edges = graph.get(match.winningTeam);

            if (edges == null) {
                edges = new HashSet<>();
                graph.put(match.winningTeam, edges);
            }
            edges.add(match.losingTeam);
        }
        return graph;
    }

    private static boolean isReachableDFS(Map<String, Set<String>> graph, String curr, String dest, Set<String> visited) {

        if (curr.equals(dest)) {
            return true;
        } else if (visited.contains(curr) || graph.get(curr) == null) {
            return false;
        }
        visited.add(curr);
        for (String team : graph.get(curr)) {
            if (isReachableDFS(graph, team, dest, visited)) {
                return true;
            }
        }
        return false;
    }
}
