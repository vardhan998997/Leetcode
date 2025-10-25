class Solution {
    public int totalMoney(int n) {
        int len = n/7, tot = 0, x = 7, sub = 0;
        for(int i = 0;i<len;i++){
            tot += (x * (x + 1) / 2) - (sub * (sub + 1) / 2);
            x++;sub++;
        }

        int rem = (n%7) + sub;
        tot += (rem * (rem + 1)/2) - (sub * (sub + 1)/2);
    return tot;
    }
}
