class Solution {
    public int[] getNoZeroIntegers(int n) {
        if(n==1) return new int[]{1,1};

        for(int i = 1;i<=n;i++){
            if(isnotZero(i) && isnotZero(n-i)){
                return new int[]{i, n-i};
            }
        }
        return new int[]{1,1};
    }

    public boolean isnotZero(int n){
        while(n>0){
            if(n%10 == 0) return false;
            n /= 10;
        }
        return true;
    }
}

