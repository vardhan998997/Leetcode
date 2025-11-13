class Solution {
    public int maxOperations(String s) {
        int CountOnes = s.replace("0","").length();

        int n = s.length(), ans = 0, i = n-1;
        while(i>=0){
            if(s.charAt(i)=='0'){
                while(i>=0 && s.charAt(i)=='0'){
                    i--;
                }
                i++;
                ans += CountOnes;
            }else{
                CountOnes--;
            }
            i--;
        }
        return ans;
    }
}
