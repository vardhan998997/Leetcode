class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        boolean visited[][] = new boolean[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(i, j, n, m, board, visited, word, 0)) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, int n, int m, char[][] board, boolean[][] visited, String word, int idx){
        if(idx==word.length()) return true;
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j] || board[i][j]!=word.charAt(idx)) return false;

        visited[i][j] = true;

        if(dfs(i+1, j, n, m, board, visited, word, idx+1) ||
           dfs(i-1, j, n, m, board, visited, word, idx+1) || 
           dfs(i, j+1, n, m, board, visited, word, idx+1) ||
           dfs(i, j-1, n, m, board, visited, word, idx+1)) return true;

           visited[i][j] = false;
           return false;
    }
}
