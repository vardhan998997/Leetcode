class Solution {
    public int maxOperations(String s) {
        int CountOnes = 0;
        for(char ch : s.toCharArray()){
            CountOnes += (ch=='1') ? 1 : 0;
        }

        int n = s.length(), ans = 0;
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                if(i-1>=0 && s.charAt(i-1)=='0') continue;
                ans += CountOnes;
            }else{
                CountOnes--;
            }
        }
        return ans;
    }
}
