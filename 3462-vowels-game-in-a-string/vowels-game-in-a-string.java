class Solution {
    public boolean doesAliceWin(String s) {
        int countVowels = 0;
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                countVowels++;
            }
        }

        return countVowels>0;
    }
    
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}
