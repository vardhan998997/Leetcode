class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
         }

         for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
         }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, visited, adj);
    }

    public boolean dfs(int node, int destination, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        if(node == destination){
            return true;
        }
        visited[node] = true;

        for(int neighbor : adj.get(node)){
            if(!visited[neighbor]){
                if(dfs(neighbor, destination, visited, adj)) return true;
            }
        }
        return false;
    }
}

