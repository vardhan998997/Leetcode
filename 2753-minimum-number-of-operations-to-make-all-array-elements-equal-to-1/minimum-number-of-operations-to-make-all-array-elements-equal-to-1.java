class Solution {
    public int minOperations(int[] nums) {
        int minOpe = Integer.MAX_VALUE, n = nums.length;
        int totOnes = 0, gcd = 0;
        for(int x : nums){
            totOnes += (x==1) ? 1 : 0;
            gcd = Gcd(gcd, x);
        }
        if(totOnes>0){
            return n - totOnes;
        }
        if(gcd>1){
            return -1;
        }

        for(int i = 0;i<n;i++){
            int currentGcd = 0;
            for(int j = i;j<n;j++){
                currentGcd = Gcd(currentGcd, nums[j]);
                if(currentGcd==1){
                    minOpe = Math.min(minOpe, j-i+1);
                    break;
                }
            }
        }

        return minOpe + n - 2;
    }

    public int Gcd(int n1, int n2){
        while(n1!=0){
            int temp = n2%n1;
            n2 = n1;
            n1 = temp;
        }
        return n2;
    }
}