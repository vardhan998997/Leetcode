class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int tot = 10;
        int uniqueDigits = 9 , remainingdigits = 9;
        for(int i = 2;i<=n;i++){
            remainingdigits *= uniqueDigits;
            tot += remainingdigits;
            uniqueDigits--;
        }
        return tot;
    }
}