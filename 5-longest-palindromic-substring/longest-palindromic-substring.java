class Solution {
    public String longestPalindrome(String s){
        if(s.length()==1) return s;
        int low = -1, high = s.length();
        String ans = "";

        for(int i = 1;i<s.length();i++){
            // for odd length;
            low = i;
            high = i;

            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > ans.length()){
                ans = palindrome;
            }

            // for even length;

            low = i-1; high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            palindrome = s.substring(low+1, high);
            if(palindrome.length() > ans.length()){
                ans = palindrome;
            }
        }
        return ans;
    }
}
