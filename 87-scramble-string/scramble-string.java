class Solution {
        HashMap<String, Boolean> memo = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2)) return true;

        if(s1.length()!=s2.length()) return false;

        String key = s1+ " " + s2;
        if(memo.containsKey(key)) return memo.get(key);
        
        if(!isAnagram(s1, s2)){
            memo.put(key, false);
            return false;
        }
        
        int n = s1.length();

        for(int i = 1;i<n;i++){

            if(isScramble(s1.substring(0,i), s2.substring(0,i)) && 
                isScramble(s1.substring(i), s2.substring(i))){
                    memo.put(key, true);
                    return true;
                }


            if(isScramble(s1.substring(0, i), s2.substring(n-i)) &&
                isScramble(s1.substring(i), s2.substring(0, n-i))){
                    memo.put(key, true);
                    return true;
            } 
        }

        memo.put(key, false);
        return false;
    }

    public boolean isAnagram(String s1, String s2){
        int[] freq = new int[26];
        for(char ch : s1.toCharArray()) freq[ch-'a']++;
        for(char ch : s2.toCharArray()) freq[ch-'a']--;

        for(int i = 0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}
