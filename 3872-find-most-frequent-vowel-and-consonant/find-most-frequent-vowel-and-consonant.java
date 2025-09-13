class Solution {
    public int maxFreqSum(String s) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        int vowelMax = 0, conMax = 0;
        for(int i = 0;i<26;i++){
            char c = (char)(i + 'a');
            if(isvowel(c)){
                vowelMax = Math.max(vowelMax, freq[i]);
            }else{
                conMax = Math.max(conMax, freq[i]);
            }
        }
        return vowelMax + conMax;
    }

    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}

