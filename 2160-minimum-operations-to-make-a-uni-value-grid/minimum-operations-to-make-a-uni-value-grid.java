class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> all = new ArrayList<>();
        for(int[] row : grid){
            for(int val : row){
                all.add(val);
            }
        }

        int mod = all.get(0)%x;
        for(int num : all){
            if(num % x != mod) return -1;
        }

        Collections.sort(all);
        int tot_ope = 0, median = all.get(all.size()/2);
        for(int v : all){
            tot_ope += Math.abs(v - median) / x;
        }
        return tot_ope;
    }
}
