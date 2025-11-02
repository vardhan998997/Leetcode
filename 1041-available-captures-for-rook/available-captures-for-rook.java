class Solution {
    int attack = 0;
    public int numRookCaptures(char[][] board) {
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                if(board[i][j]=='R'){
                    // up
                    dfs(i, j, -1, 0, 8, 8, board);

                    // down
                    dfs(i, j, 1, 0, 8, 8, board);

                    // left
                    dfs(i, j, 0, -1, 8, 8, board);

                    // right
                    dfs(i, j, 0, 1, 8, 8, board);
                }
            }
        }
        return attack;
    }

    public void dfs(int row, int col, int i, int j, int n, int m, char[][] board){
        if(row<0 || col<0 || row>=n || col>=m || board[row][col]=='B'){
            return;
        }
        if(board[row][col] == 'p'){
            attack++;
            return;
        }

        dfs(row+i, col+j, i, j, n, m, board);
    }
}
