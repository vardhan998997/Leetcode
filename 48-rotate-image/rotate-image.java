class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        for(int i = 0;i<n;i++){
            for(int j = i;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = n-1;j>=n/2;j--){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}

