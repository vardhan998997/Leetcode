class Solution {
    public void solve(char[][] board) {
        int n = board.length , m = board[0].length;
        if(n==0 || n==1 || m==1) return;

        Queue<int[]> queue = new LinkedList<>();
        boolean visited[][] = new boolean[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(board[i][j]=='O'){
                        queue.offer(new int[]{i,j});
                        visited[i][j] = true;
                    }
                }
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            board[cell[0]][cell[1]] = 'V';
 
            for(int[] di : dir){
                int newRow = di[0] + cell[0];
                int newCol = di[1] + cell[1];

                if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && board[newRow][newCol]=='O' && !visited[newRow][newCol]){
                    queue.offer(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
                if(board[i][j]=='V'){
                    board[i][j] = 'O';
                }
            }
        }
    }
}
