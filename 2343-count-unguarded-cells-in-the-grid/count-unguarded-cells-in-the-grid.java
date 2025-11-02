class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        boolean seen = false;
        int[][] grid = new int[m][n];
        for(int[] wall : walls) grid[wall[0]][wall[1]] = 1;
        for(int[] guard : guards) grid[guard[0]][guard[1]] = 2;

        //// left to right
        for(int i = 0;i<m;i++){
            seen = false;
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1) seen = false;
                else if(grid[i][j] == 2) seen = true;
                else if(seen) grid[i][j] = 3;
            }
        }

        //// right to left
        for(int i = 0;i<m;i++){
            seen = false;
            for(int j = n-1;j>=0;j--){
                if(grid[i][j]==1) seen = false;
                else if(grid[i][j] == 2) seen = true;
                else if(seen) grid[i][j] = 3;
            }
        }

        ///// top to bottom
        for(int i = 0;i<n;i++){
            seen = false;
            for(int j = 0;j<m;j++){
                if(grid[j][i]==1) seen = false;
                else if(grid[j][i] == 2) seen = true;
                else if(seen) grid[j][i] = 3;
            }
        }
        

        ///// bottom to top
        for(int i = 0;i<n;i++){
            seen = false;
            for(int j = m-1;j>=0;j--){
                if(grid[j][i]==1) seen = false;
                else if(grid[j][i] == 2) seen = true;
                else if(seen) grid[j][i] = 3;
            }
        }


        int unguardians = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 0) unguardians++;
            }
        }
        return unguardians;
    }
}
