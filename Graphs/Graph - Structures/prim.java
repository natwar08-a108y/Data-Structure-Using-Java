import java.util.PriorityQueue;
import java.util.ArrayList;

class GFG {

    static int primMST(ArrayList<ArrayList<ArrayList<Integer>>> adj) {

        int V = adj.size();

        // Min-heap storing {weight, vertex}
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);

        boolean[] visited = new boolean[V];
        int res = 0;

        // Start from node 0
        pq.add(new int[]{0, 0});

        while (!pq.isEmpty()) {

            int[] p = pq.poll();
            int wt = p[0];
            int u = p[1];

            if (visited[u])
                continue;

            res += wt;
            visited[u] = true;

            // Push adjacent edges
            for (ArrayList<Integer> v : adj.get(u)) {
                if (!visited[v.get(0)]) {
                    pq.add(new int[]{v.get(1), v.get(0)});
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int V = 3;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(new ArrayList<>(java.util.Arrays.asList(1, 5)));
        adj.get(1).add(new ArrayList<>(java.util.Arrays.asList(0, 5)));

        adj.get(1).add(new ArrayList<>(java.util.Arrays.asList(2, 3)));
        adj.get(2).add(new ArrayList<>(java.util.Arrays.asList(1, 3)));

        adj.get(0).add(new ArrayList<>(java.util.Arrays.asList(2, 1)));
        adj.get(2).add(new ArrayList<>(java.util.Arrays.asList(0, 1)));

        System.out.println(primMST(adj));
    }
}