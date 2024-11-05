class Solution {
    public void dfs(int node, List<List<Integer>> adj, int[] vis) {
        vis[node] = 1;
        for (int a : adj.get(node)) {
            if (vis[a] == 0) {
                dfs(a, adj, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int m = isConnected.length;
        int n = isConnected[0].length;
        List<List<Integer>> ad = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            ad.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    ad.get(i).add(j);
                    ad.get(j).add(i);
                }
            }
        }

        int[] visited = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(i, ad, visited);
            }
        }
        return count;
    }
}
