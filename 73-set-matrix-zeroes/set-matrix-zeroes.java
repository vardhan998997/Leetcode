class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean[][] zeros = new boolean[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){
                    dfs(i, j, n, m, -1, 0, zeros, matrix);
                    dfs(i, j, n, m, 1, 0, zeros, matrix);
                    dfs(i, j, n, m, 0, -1, zeros, matrix);
                    dfs(i, j, n, m, 0, 1, zeros, matrix);
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(zeros[i][j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void dfs(int row, int col, int n, int m, int i, int j, boolean[][] zeros, int[][] matrix){
        if(row<0 || col<0 || row>=n || col>=m){
            return;
        }
        zeros[row][col] = true;
        dfs(row+i, col+j, n, m, i, j, zeros, matrix);
    }
}
