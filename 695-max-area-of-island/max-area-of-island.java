class Solution {
    int count = 0;
    int ans = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==1){
                    count = 0;
                    dfs(grid, n, m, i, j);
                    ans = Math.max(ans, count);
                }
            }
        }
        return ans;
    }

    public void dfs(int[][] grid, int n, int m, int row, int col){
        if(row<0 || col<0 || row>=n || col>=m || grid[row][col]==0){
            return;
        }

        grid[row][col] = 0;
        count++;

        dfs(grid, n, m, row-1, col);
        dfs(grid, n, m, row+1, col);
        dfs(grid, n, m, row, col+1);
        dfs(grid, n, m, row, col-1);
    }
}
