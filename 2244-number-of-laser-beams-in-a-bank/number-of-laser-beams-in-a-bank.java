class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int prev = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            int curr = CountSetBits(bank[i]);
            if (curr > 0) {
                ans += curr * prev;
                prev = curr;
            }
        }
        return ans;
    }

    public int CountSetBits(String s){
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}
