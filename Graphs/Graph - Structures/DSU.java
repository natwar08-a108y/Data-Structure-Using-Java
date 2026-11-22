import java.util.*;

class MyDSU {
    private int[] parent;

    public MyDSU(int n)
    {
        parent = new int[n];

        // Initialize each element as its own representative
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Find the representative using path compression
    public int find(int x)
    {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // Merge the group containing x into the group
    // containing y
    public void unionSet(int x, int y)
    {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            parent[rootX] = rootY;
        }
    }
}

class DSU {
    public static void main(String[] args)
    {
        int n = 5;

        // Query types:
        // [1, x, y] -> unionSet(x, y)
        // [2, x]    -> find(x)
        int[][] queries
            = { { 2, 4 }, { 2, 1 }, { 1, 3, 1 }, { 2, 3 } };

        MyDSU dsu = new MyDSU(n);
        List<Integer> result = new ArrayList<>();

        for (int[] q : queries) {
            int type = q[0];
            if (type == 1) {
                // unionSet(x, y)
                int x = q[1];
                int y = q[2];
                dsu.unionSet(x, y);
            }
            else if (type == 2) {
                // find(x)
                int x = q[1];
                result.add(dsu.find(x));
            }
        }

        // Print output formatted as [4, 1, 1]
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i + 1 < result.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}