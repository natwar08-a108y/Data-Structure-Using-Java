import java.util.*;

public class BFS {

    // Helper method to add an undirected edge in the matrix
    static void addEdge(int[][] adjMatrix, int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    // BFS using Adjacency Matrix and 1-based boolean visited array
    static void bfs(int V, int[][] adjMatrix, int start) {
        boolean[] visited = new boolean[V + 1];
        Queue<Integer> queue = new LinkedList<>();

        // Mark start node visited and enqueue
        visited[start] = true;
        queue.offer(start);

        System.out.print("BFS starting from " + start + ": ");

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.print(curr + " ");

            // Scan row 'curr' from column 1 to V
            for (int i = 1; i <= V; i++) {
                if (adjMatrix[curr][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 8;
        // (V + 1) x (V + 1) matrix for 1-based indexing
        int[][] adjMatrix = new int[V + 1][V + 1];

        addEdge(adjMatrix, 1, 2);
        addEdge(adjMatrix, 1, 3);
        addEdge(adjMatrix, 1, 4);
        addEdge(adjMatrix, 2, 5);
        addEdge(adjMatrix, 2, 6);
        addEdge(adjMatrix, 4, 7);
        addEdge(adjMatrix, 7, 8);

        bfs(V, adjMatrix, 1); // Output: 1 2 3 4 5 6 7 8
        bfs(V, adjMatrix, 7); // Output: 7 4 8 1 2 3 5 6
    }
}
