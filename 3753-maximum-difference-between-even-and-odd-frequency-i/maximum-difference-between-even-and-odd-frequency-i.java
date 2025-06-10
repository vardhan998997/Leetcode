class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int res = 0;
        int max_odd_freq = Integer.MIN_VALUE;
        int min_even_freq = Integer.MAX_VALUE;
        for(int ele : freq){
            if(ele==0) continue;
            if(ele%2!=0){
                max_odd_freq = Math.max(max_odd_freq, ele);
            }else{
               min_even_freq = Math.min(min_even_freq, ele);
            }
        }
        return max_odd_freq - min_even_freq;
    }
}
