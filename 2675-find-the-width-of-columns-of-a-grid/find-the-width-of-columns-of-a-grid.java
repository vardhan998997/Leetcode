class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[] res = new int[m];
        int k = 0;

        for(int i = 0;i<m;i++){
            int max = 0;
            for(int j = 0;j<n;j++){
                int len = (int)Math.log10(Math.abs(grid[j][i]));
                if(grid[j][i] == 0){
                    len = 0;
                }
                max = grid[j][i] < 0 ? Math.max(max, 2 + len) : Math.max(max, 1 + len);
                System.out.println(grid[j][i] + " " +max);
            }
            res[k++] = max;
        }
        return res;
    }
}
