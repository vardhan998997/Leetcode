class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String stringArr[] = text.split(" ");
        int cnt = 0;
        boolean broken[] = new boolean[26];
        for(char ch : brokenLetters.toCharArray()){
            broken[ch-'a'] = true;
        }

        for(String s : stringArr){
            boolean isValid = true;

            for(char ch : s.toCharArray()){
                if(broken[ch-'a']){
                    isValid = false;
                    break;
                }
            }

            if(isValid) cnt++;
        }
        return cnt;
    }
}
