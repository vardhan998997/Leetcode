class Solution {
    public void solve(char[][] board) {
        int n = board.length, m = board[0].length;
        if(n==0 || n==1 || m == 1 || m == 0) return;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(board[i][j]=='O'){
                        dfs(i, j, n, m, board);
                    }
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                } 
                if(board[i][j]=='!'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void dfs(int row, int col, int n, int m, char[][] board){
        if(row<0 || col<0 || row>=n || col>=m || board[row][col]=='X' || board[row][col]=='!'){
            return;
        }

        board[row][col] = '!';
        dfs(row-1, col, n, m, board);
        dfs(row+1, col, n, m, board);
        dfs(row, col-1, n, m, board);
        dfs(row, col+1, n, m, board);
    }
}
