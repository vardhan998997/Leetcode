class Solution {
    public int smallestNumber(int n) {
        for(int i = 0;i<n;i++){
            int power = (int)Math.pow(2, i);
            if(power>n){
                return power-1;
            }
        }
        return 1;
    }
}
