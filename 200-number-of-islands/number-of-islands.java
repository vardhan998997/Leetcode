class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        if(n==0) return 0;

        int cnt = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(i,j,n,m,grid);
                }
            }
        }
        return cnt;
    }

    public void dfs(int row, int col, int n, int m, char[][] grid){
        if(row<0 || col<0 || row>=n || col>=m || grid[row][col]=='0'){
            return;
        }

        grid[row][col] = '0';

        dfs(row+1, col, n, m , grid);
        dfs(row-1, col, n, m, grid);
        dfs(row, col-1, n, m, grid);
        dfs(row, col+1, n, m, grid);
    }
}

