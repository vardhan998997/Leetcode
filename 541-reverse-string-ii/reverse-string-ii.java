class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();

        for (int st = 0; st < n; st += 2 * k) {
            int end = Math.min(st + k - 1, n - 1);
            reverse(sb, st, end);
        }
        
        return sb.toString();
    }

    public static void reverse(StringBuilder sb , int l, int r){
        while (l < r) {
            char left = sb.charAt(l);
            char right = sb.charAt(r);

            sb.setCharAt(l, right);
            sb.setCharAt(r, left);

            l++;
            r--;
        }
    }
}
