class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int close = 0;
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==0){
                    if(dfs(grid, i, j, n, m)){
                        close++;
                    }
                }
            }
        }
        return close;
    }

    public static boolean dfs(int[][] grid, int row, int col, int n, int m){
        if(row<0 || col<0 || row>=n || col>=m){
            return false;
        }

        if(grid[row][col]==1){
            return true;
        }

        grid[row][col] = 1;

        boolean up = dfs(grid, row-1, col, n, m);
        boolean down = dfs(grid, row+1, col, n, m);
        boolean left = dfs(grid, row, col+1, n, m);
        boolean right = dfs(grid, row, col-1, n, m);

        return up && down && left && right;
    }
}
