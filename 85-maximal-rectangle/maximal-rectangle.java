class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] prefSum = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0') {
                    prefSum[i][j] = 0;
                } else {
                    prefSum[i][j] = (i == 0 ? 1 : prefSum[i - 1][j] + 1);
                }
            }
        }


        int max_ones = 0;
        for(int row[] : prefSum){
            int currMax = histogram(row);
            max_ones = Math.max(currMax, max_ones);
        }
        return max_ones;
    }

    public int histogram(int[] row){
        Stack<Integer> stack = new Stack<>();
        int n = row.length, nse = 0, pse = 0, max_len = 0;

        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && row[stack.peek()]>=row[i]){
                int element = stack.pop();
                pse = stack.isEmpty() ? -1 : stack.peek();
                max_len = Math.max(max_len, row[element] * (i - pse - 1));
            }
            stack.push(i);
        }

        nse = n;
        while(!stack.isEmpty()){
            int element = stack.pop();
            pse = stack.isEmpty() ? -1 : stack.peek();
            max_len = Math.max(max_len, row[element] * (nse - pse - 1));
        }
        return max_len;
    }
}
