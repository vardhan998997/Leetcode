class Solution {
    public boolean isPossibleToCutPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        if(!dfs(grid, 0, 0, n, m)) return true;

        grid[0][0] = 1;
        grid[n-1][m-1] = 1;

        return !dfs(grid, 0, 0, n, m);
    }

    public static boolean dfs(int[][] grid, int row, int col, int n, int m){
        if(row>=n || col>=m || grid[row][col]==0){
            return false;
        }

        if(row==n-1 && col==m-1) return true;

        grid[row][col] = 0;

        return dfs(grid, row, col+1, n, m) || dfs(grid, row+1, col, n, m);
    }
}
