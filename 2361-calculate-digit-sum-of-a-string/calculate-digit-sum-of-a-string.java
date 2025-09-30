class Solution {
    public String digitSum(String s, int k) {
        String sum = "";
        while(s.length()>k){
            StringBuilder sb = new StringBuilder();
            int i;
            for(i = 0;i<s.length()-k+1;i+=k){
                sum = sum(s.substring(i,i+k));
                System.out.println(sum);
                sb.append(sum);
            }
            if(i<s.length()){
                sum = sum(s.substring(i));
                System.out.println(sum);
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }

    public String sum(String str){
        int sum = 0;
        for(char ch : str.toCharArray()){
            sum += ch - '0';
        }
        return Integer.toString(sum);
    }
}
