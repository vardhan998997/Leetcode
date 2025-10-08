class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] store = new int[n][2];
        for(int i = 0;i<n;i++){
            store[i][0] = difficulty[i];
            store[i][1] = profit[i];
        }
        Arrays.sort(store, (a,b) -> Integer.compare(a[0] , b[0]));

        int max_profit = 0;
        for(int i : worker){
            int temp_pro = 0;
            for(int j = 0;j<n;j++){
                if(store[j][0]>i){
                    break;
                }
                temp_pro = Math.max(store[j][1], temp_pro);
            }
            max_profit += temp_pro;
        }
        return max_profit;
    }
}

