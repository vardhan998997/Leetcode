class Solution {
    public int maxOperations(String s) {
        int CountOnes = s.replace("0","").length();

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
