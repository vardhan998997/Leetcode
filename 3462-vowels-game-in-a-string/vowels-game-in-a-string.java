class Solution {
    public boolean doesAliceWin(String s) {
        int countVowels = 0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
    }
        return false;
  }
}
