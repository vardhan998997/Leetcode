class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans_count = prices.length, seq_count = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i-1]-prices[i]==1){
                ans_count += seq_count + 1;
                seq_count++;
            }else{
                seq_count = 0;
            }
        }
        return ans_count;
    }
}
