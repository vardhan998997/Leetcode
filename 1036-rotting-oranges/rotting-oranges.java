class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int n = grid.length, m = grid[0].length;
        int num_ones = 0;
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    num_ones++;
                }
                }
        }

        if(num_ones==0) return 0;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        int minutes = -1;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            minutes++;
            for(int i = 0;i<size;i++){
                int cell[] = queue.poll();

                for(int di[] : dir){
                    int newRow = cell[0] + di[0];
                    int newCol = cell[1] + di[1];

                    if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && grid[newRow][newCol]==1){
                        num_ones--;
                        grid[newRow][newCol] = 2;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }
        return (num_ones==0) ? minutes : -1;
    }
}
