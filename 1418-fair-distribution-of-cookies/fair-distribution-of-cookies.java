class Solution {
    int ans = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        int n = cookies.length;
        ishelper(cookies, 0, k, new int[k]);
        return ans;
    }

    public void ishelper(int[] cookies, int start, int k, int[] temp){
        if(start == cookies.length){
            int max = Integer.MIN_VALUE;
            for(int c : temp){
                max = Math.max(c, max);
            }
            ans = Math.min(max, ans);
            return;
        }

        for(int i = 0;i<k;i++){
            temp[i] += cookies[start];
            ishelper(cookies, start+1, k, temp);
            temp[i] -= cookies[start]; 
        }
    }
}
