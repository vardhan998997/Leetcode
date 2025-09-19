class Solution {
    public int maxProductPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        long[][] max = new long[n][m];
        long[][] min = new long[n][m];

        max[0][0] = min[0][0] = grid[0][0];

        for(int j = 1;j<m;j++){
            max[0][j] = min[0][j] = max[0][j-1] * grid[0][j];
        }

        for(int i = 1;i<n;i++){
            max[i][0] = min[i][0] = min[i-1][0] * grid[i][0];
        }

        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                long a = Math.max(max[i-1][j], max[i][j-1]);
                long b = Math.min(min[i-1][j], min[i][j-1]);

                max[i][j] = Math.max(a*grid[i][j], b*grid[i][j]);
                min[i][j] = Math.min(a*grid[i][j], b*grid[i][j]);
            }
        }

        long ans = max[n-1][m-1];
        return ans<0 ? -1 : (int)(ans % 1000000007);
    }
}
