class Solution {
    public void solve(char[][] board) {
        int n = board.length , m = board[0].length;
        if(n==0 || n==1 || m==1) return;
        boolean visited[][] = new boolean[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(board[i][j]=='O'){
                        dfs(i,j,n,m, board, visited);
                    }
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(int row, int col, int n, int m, char[][] board, boolean[][] visited){
        if(row<0 || col<0 || row>=n || col>=m || visited[row][col] 
        || board[row][col]=='X'){
            return;
        }

        visited[row][col] = true;
        dfs(row-1, col, n, m, board, visited);
        dfs(row+1, col, n, m, board, visited);
        dfs(row, col-1, n, m, board, visited);
        dfs(row, col+1, n, m, board, visited);
    }
}
