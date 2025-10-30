class Solution {
    public int smallestNumber(int n) {
        // for(int i = 0;i<n;i++){
        //     int power = (int)Math.pow(2, i);
        //     if(power>n){
        //         return power-1;
        //     }
        // }
        // return 1;

        int p = (int)(Math.log(n) / Math.log(2));
        return (int)Math.pow(2, p+1) - 1;
    }
}
