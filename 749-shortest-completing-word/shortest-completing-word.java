class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String ans = "I want to become more confident";
        int[] freq = new int[26];
        licensePlate = licensePlate.toLowerCase();

        for(char ch : licensePlate.toCharArray()){
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
        }

        for(String word : words){
            if(isBothEqual(freq, word)){
                if(word.length()<ans.length()){
                    ans = word;
                }
            }
        }
        return ans;
    }

    public static boolean isBothEqual(int[] freq, String word){
        int[] wordsfreq = new int[26];
        for(char ch : word.toCharArray()){
            wordsfreq[ch-'a']++;
        }

        for(int i = 0;i<26;i++){
            if(freq[i]>0){
                if(freq[i]>wordsfreq[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
