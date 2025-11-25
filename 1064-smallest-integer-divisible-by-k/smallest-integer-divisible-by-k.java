class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        if(1%k==0) return 1;
        int val = 1, len = 1;
        while(val>0){
            val = (val * 10 + 1)%k;
            len++;
            if(len>k) return -1;
        }
        return len;
    }
}
