class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        HashMap<String, Integer> freqMax = new HashMap<>();

        for(int[] row : matrix){
            StringBuilder temp = new StringBuilder();
            for(int j = 0;j<m;j++){
                temp.append(row[j] == row[0] ? '1' : '0');
            }
            String s = temp.toString();
            freqMax.put(s, freqMax.getOrDefault(s, 0)+1);
        }

        int max_rows = 0;
        for(int val : freqMax.values()){
            max_rows = Math.max(max_rows, val);
        }
        return max_rows;
    }
}
