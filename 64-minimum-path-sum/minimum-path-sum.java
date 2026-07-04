class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i==0 && j==0) continue;
                grid[i][j] = Math.min((i>0 ? grid[i-1][j] : Integer.MAX_VALUE), (j>0 ? grid[i][j-1] : Integer.MAX_VALUE)) + grid[i][j];
            }
        }
        return grid[n-1][m-1];
    }
}
