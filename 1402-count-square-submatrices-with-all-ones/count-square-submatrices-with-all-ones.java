class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // int[][] dp = new int[n][m];
        int ans = 0;
        for(int i = 0;i<n;i++){
            ans += matrix[i][0];
        }

        for(int j = 1;j<m;j++){
            ans += matrix[0][j];
        }

        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(matrix[i][j]==1){
                    matrix[i][j] = 1 + Math.min(Math.min(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1]);
                    ans += matrix[i][j];
                }
            }
        }

        return ans;
    }
}
