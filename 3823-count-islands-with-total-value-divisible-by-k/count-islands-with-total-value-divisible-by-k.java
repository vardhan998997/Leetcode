class Solution {
    int sum = 0;
    public int countIslands(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        if(n==0) return 0;
        int cnt = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]!=0){
                    dfs(i,j,n,m,grid);
                    if(sum%k==0){
                        cnt++;
                    }
                    sum = 0;
                }
            }
        }
        return cnt;
    }

    public void dfs(int row, int col, int n, int m, int[][] grid){
        if(row<0 || col<0 || row>=n || col>=m || grid[row][col]==0){
            return;
        }

        sum += grid[row][col];
        grid[row][col] = 0;

        dfs(row-1, col, n, m, grid);
        dfs(row+1, col, n, m, grid);
        dfs(row, col-1, n, m, grid);
        dfs(row, col+1, n, m, grid);
    }
}
