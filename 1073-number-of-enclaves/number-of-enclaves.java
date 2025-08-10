class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        if(n==0) return 0;

        boolean visited[][] = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==1 && !visited[i][j]){
                        dfs(i,j,n,m,grid,visited);
                    }
                }
            }
        }
        
        int cnt = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void dfs(int row, int col, int n, int m, int[][] board, boolean[][] visited){
        if(row<0 || col<0|| row>=n || col>=m || board[row][col]==0 || visited[row][col]){
            return;
        }

        visited[row][col] = true;
        board[row][col] = 0;
        
        dfs(row-1, col, n, m, board, visited);
        dfs(row+1, col, n, m, board, visited);
        dfs(row, col-1, n, m, board, visited);
        dfs(row, col+1, n, m, board, visited);
    }
}
