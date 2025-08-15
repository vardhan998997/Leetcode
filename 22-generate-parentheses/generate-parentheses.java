class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(0 , 0 , n , ans , sb);
        return ans;
    }

    public void helper(int open , int close , int n , List<String> ans , StringBuilder sb){
        if (sb.length()==2*n) {
            ans.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append("(");
            helper(open+1, close, n , ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(")");
            helper(open, close+1, n,  ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
