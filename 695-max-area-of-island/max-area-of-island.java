class Solution {
    int tempCount = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int ans = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==1){
                    tempCount = 0;
                    dfs(i, j, n, m, grid);
                    ans = Math.max(ans, tempCount);
                }
            }
        }
        return ans;
    }

    public void dfs(int row, int col, int n, int m, int[][] grid){
        if(row<0 || col<0 || row>=n || col>=m || grid[row][col]==0){
            return;
        }
        tempCount++;
        grid[row][col] = 0;

        dfs(row-1, col, n, m, grid);
        dfs(row+1, col, n, m, grid);
        dfs(row, col-1, n, m, grid);
        dfs(row, col+1, n, m, grid);
    }
}
