class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        int st = -1;
        for(int i = 0;i<n;i++){
            freq[nums[i]]++;
        }

        for(int i = 0;i<=n;i++){
            if(freq[i]>1){
                if(st==-1){
                    st = i;
                }else{
                    return new int[]{st, i};
                }
            }
        }
        return new int[]{};
    }
}

