class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char grid[][] = new char[m][n];

        Queue<int[]> queue = new LinkedList<>();
        for(int[] guard : guards){
            grid[guard[0]][guard[1]] = 'G';
            queue.offer(new int[]{guard[0], guard[1]});
        }
        for(int[] wall : walls){
            grid[wall[0]][wall[1]] = 'W';
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        
        while(!queue.isEmpty()){
            int[] cell = queue.poll();

            for(int[] di : dir){
                int newRow = cell[0] + di[0];
                int newCol = cell[1] + di[1];

                while(newRow>=0 && newCol>=0 && newRow<m && newCol<n && grid[newRow][newCol]!='G' && grid[newRow][newCol]!='W'){
                    grid[newRow][newCol] = 'g';
                    newRow += di[0];
                    newCol += di[1];
                }
            }
        }

        int unguardians = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]=='\u0000'){
                    unguardians++;
                }
            }
        }
        return unguardians;
    }
}
