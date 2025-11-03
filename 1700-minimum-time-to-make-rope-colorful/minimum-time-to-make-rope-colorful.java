class Solution {
    public int minCost(String colors, int[] neededTime) {
        int prevMin = 0;
        int n = neededTime.length, minTime = 0;
        if(n==0 || n==1) return 0;  
        char prev = colors.charAt(0);

        for(int i = 0;i<n;i++){
                if(colors.charAt(i) == prev){
                    if(prevMin<neededTime[i]){
                        minTime += prevMin;
                        prevMin = neededTime[i];
                    }else{
                        minTime += neededTime[i];
                    }
                }else{
                    prevMin = neededTime[i];
                }
            prev = colors.charAt(i);
            }
        return minTime;
    }
}
