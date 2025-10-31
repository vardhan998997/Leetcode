class Solution {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        if(n==0) return 0;
        long ans = target[0];

        for(int i = 1;i<n;i++){
            if(target[i]>target[i-1]){
                ans += (long)(target[i] - target[i-1]);
            }
        }
        return (int)ans;
    }
}
