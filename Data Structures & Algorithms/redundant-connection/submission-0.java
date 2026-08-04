class Solution {

    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;
        ArrayList<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int v = edges[i][0];
            int u = edges[i][1];

            boolean[] vis = new boolean[n + 1]; // reset for each BFS

            // check cycle BEFORE adding edge
            if (bfs(v, u, vis, adj)) {
                return new int[]{v, u};
            }

            adj.get(v).add(u);
            adj.get(u).add(v);
        }

        return new int[0];
    }

    public boolean bfs(int v, int u, boolean[] vis, ArrayList<List<Integer>> adj) {

        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(v);
        vis[v] = true;

        while (!q1.isEmpty()) {
            int node = q1.poll();

            for (int it : adj.get(node)) {
                if (it == u) {
                    return true;
                }
                if (!vis[it]) {
                    vis[it] = true;
                    q1.offer(it);
                }
            }
        }
        return false;
    }
}
