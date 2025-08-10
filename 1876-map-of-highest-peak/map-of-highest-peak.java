class Node{
    int first;
    int second;
    int val;
    Node(int first, int second, int val){
        this.first = first;
        this.second = second;
        this.val = val;
    }
}

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length, m = isWater[0].length;
        int[][] ans = new int[n][m];
        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(isWater[i][j]==1){
                    queue.offer(new Node(i,j,0));
                    visited[i][j] = true;
                }
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!queue.isEmpty()){
            Node newNode = queue.poll();
            int row = newNode.first, col = newNode.second, val = newNode.val;
            ans[row][col] = val;

            for(int[] di : dir){
                int newRow = row + di[0];
                int newCol = col + di[1];

                if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && !visited[newRow][newCol]){
                    visited[newRow][newCol] = true;
                    queue.offer(new Node(newRow, newCol, val+1));
                }
            }
        }
        return ans;
    }
}
