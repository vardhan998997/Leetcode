class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        Arrays.fill(dp[0] , Integer.MAX_VALUE-1);

        for(int i =1;i<=n;i++){
            dp[i][0] = 0;
            for(int j = 1;j<dp[0].length;j++){
                if(coins[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j-coins[i-1]]);
                }
            }
        }
        return dp[n][amount]>=Integer.MAX_VALUE-1 ? -1 : dp[n][amount];
    }
}
