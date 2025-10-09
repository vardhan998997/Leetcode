class Solution {
    public long countVowels(String word) {
        int n = word.length();
        long tot = 0, prev = 0;

        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                prev += (long)i + 1;
            }
            tot += prev;
        }
        return tot;
    }
}
