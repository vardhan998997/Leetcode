class Solution {
    public int numberOfSpecialChars(String word) {
        int[] suffix = new int[26];
        int[] pref = new int[26];

        for(char ch : word.toCharArray()){
            if(ch>='a' && ch<='z') suffix[ch-'a']++;
        }

        int cnt = 0;
        boolean[] visited = new boolean[26];

        for(char ch : word.toCharArray()){
            if(ch>='A' && ch<='Z'){
                char lc = (char)((int)ch + 32);
                if(visited[lc-'a']) continue;
                if(suffix[lc-'a']>0){
                    visited[lc-'a'] = true;
                    continue;
                }
                if(suffix[lc-'a']==0 && pref[lc-'a']>0){
                    visited[lc-'a'] = true;
                    cnt++;
                }
            }else{
                suffix[ch-'a']--;
                pref[ch-'a']++;
            }
        }
        return cnt;
    }
}
