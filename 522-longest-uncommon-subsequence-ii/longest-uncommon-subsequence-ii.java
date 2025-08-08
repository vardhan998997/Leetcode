class Solution {
    public int findLUSlength(String[] strs) {
        int n = strs.length;
        int ans_max = -1;
        Arrays.sort(strs,(a,b) -> b.length() - a.length());

        for(int i = 0;i<n;i++){
            int j;
            for(j = 0;j<n;j++){
                if(i!=j){
                    if(issub(strs[j],strs[i])){
                        break;
                    }
                }
            }
            if(j==n){
                return strs[i].length();
            }
        }
        return ans_max;
    }

    public boolean issub(String s1, String s2){
        int l = 0 , r = 0;
        while(l<s1.length() && r<s2.length()){
            if(s1.charAt(l)==s2.charAt(r)){
                l++;r++;
            }else{
                l++;
            }
        }
        return r == s2.length();
    }
}
