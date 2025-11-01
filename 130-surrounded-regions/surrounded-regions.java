class Solution {
    public void solve(char[][] board) {
        int n = board.length, m = board[0].length;
        if(n==0 || n==1 || m == 1 || m == 0) return;

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(board[i][j]=='O'){
                        queue.offer(new int[]{i,j});
                    }
                }
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        /// bfs
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            board[cell[0]][cell[1]] = '!';
            for(int[] di : dir){
                int newRow = cell[0] + di[0];
                int newCol = cell[1] + di[1];

                if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && board[newRow][newCol]=='O'){
                    board[newRow][newCol] = '!';
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }


        /////// 
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
}
