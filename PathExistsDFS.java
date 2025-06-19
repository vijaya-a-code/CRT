import java.util.*;
public class PathExistsDFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    public void addEdge(int src, int dest) {
        graph.putIfAbsent(src, new ArrayList<>());
        graph.putIfAbsent(dest, new ArrayList<>());
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    public boolean isPathExists(int src, int dest) {
        Set<Integer> visited = new HashSet<>();
        return dfs(src, dest, visited);
    }
    private boolean dfs(int current, int dest, Set<Integer> visited) {
        if (current == dest) return true;
        visited.add(current);
        for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, dest, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        PathExistsDFS g = new PathExistsDFS();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        int src = 0, dest = 4;
        if (g.isPathExists(src, dest)) {
            System.out.println("Path exists between " + src + " and " + dest);
        } else {
            System.out.println("No path exists between " + src + " and " + dest);
        }
    }
}
