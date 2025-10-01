class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int ans = 0;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==1){
                    int temp = 0;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i,j});
                    grid[i][j] = 0;

                    while(!queue.isEmpty()){
                        int[] cell = queue.poll();
                        temp++;

                        for(int[] di : dir){
                            int newRow = di[0] + cell[0];
                            int newCol = di[1] + cell[1];
                            if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && grid[newRow][newCol]==1){
                                queue.offer(new int[]{newRow, newCol});
                                grid[newRow][newCol] = 0;
                            }
                        }
                    }
                    ans = Math.max(ans, temp);
                }
            }
        }
        return ans;
    }
}
