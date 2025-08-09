class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val = image[sr][sc];
        if(val == color) return image;
        int n = image.length , m = image[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        
        int row = 0 , col = 0;
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            row = cell[0] ; col = cell[1];

            image[row][col] = color;
            for(int[] v : dir){
                int newRow = row + v[0];
                int newCol = col + v[1];
                
                if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && image[newRow][newCol]==val){
                    queue.offer(new int[]{newRow,newCol});
                }
            }
        }
        return image;
    }
}
