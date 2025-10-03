class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid1.length, m = grid1[0].length;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid2[i][j]==1){
                    boolean isSub = true;
                    if(dfs(i, j, n, m, grid1, grid2, isSub)) count++;
                }
            }
        }
        return count;
    }

    public boolean dfs(int i, int j, int n, int m, int[][] grid1, int[][] grid2, boolean isSub){
        if(i<0 || j<0 || i>=n || j>=m || grid2[i][j]==0){
            return true;
        }

        grid2[i][j] = 0;

        if(grid1[i][j]==0) isSub = false;

        boolean up = dfs(i+1, j, n, m, grid1, grid2, isSub);
        boolean down = dfs(i-1, j, n, m, grid1, grid2, isSub);
        boolean left = dfs(i, j-1, n, m, grid1, grid2, isSub);
        boolean right = dfs(i, j+1, n, m, grid1, grid2, isSub);

        return isSub && up && down && left && right;
    }
}