class Solution {
    public boolean doesAliceWin(String s) {
        int countVowels = 0;
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                countVowels++;
            }
        }

        if(countVowels==0) return false;
        return true;
    }
    
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}
