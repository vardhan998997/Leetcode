class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int left = 0, right = 0, count = 0;

        for(int current = 0; current < 2 * n - 1; current++){
            left = current / 2; right = left + current % 2;

            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                count++;
                left--; right++;
            }
        }
        return count;
    }
}
