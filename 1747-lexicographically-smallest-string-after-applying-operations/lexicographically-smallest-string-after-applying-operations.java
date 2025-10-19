class Solution {
    String ans = null;

    public String findLexSmallestString(String s, int a, int b) {
        ans = s; 
        helper(s, a, b, new java.util.HashSet<>());
        return ans;
    }

    public void helper(String str, int a, int b, java.util.Set<String> visited) {
        if (visited.contains(str)) return;
        visited.add(str);

        if (str.compareTo(ans) < 0) ans = str;

        String rotate = rotate(str, b);
        String add = add(str, a);

        helper(rotate, a, b, visited);
        helper(add, a, b, visited);
    }

    public String rotate(String s, int b) {
        return s.substring(b) + s.substring(0, b);
    }

    public String add(String s, int a) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            int val = arr[i] - '0';
            val = (val + a) % 10;
            arr[i] = (char) (val + '0');
        }
        return new String(arr);
    }
}
