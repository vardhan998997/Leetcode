class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        //convert matrix into list:
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }

        for(int i = 0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited, adj);
                count++;
            }
        }
        return count;
    }

    public void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;

        for(int neighbor : adj.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor, visited, adj);
            }
        }
    }
}
