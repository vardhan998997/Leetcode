class Solution {
    public long countVowels(String word) {
        long ans = 0;
        int len = word.length();
        for(int i = 0;i<len;i++){
            char ch = word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                ans += len - i + i * (long)(len - i);
            }
        }
        return ans;
    }
}
