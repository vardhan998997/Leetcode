class Solution {
    public int countOperations(int num1, int num2) {
        if(num1==0 || num2==0) return 0;
        if(num1 == num2) return 1;

        int ans = 0;
        if(num1>num2){
            ans = num1 / num2;
            num1 = num1%num2;
        }else{
            ans = num2 / num1;
            num2 = num2 % num1;
        }


        while(num1!=0 && num2!=0){
            if(num1<num2){
                num2 -= num1;
            }else{
                num1 -= num2;
            }

            ans++;
            if(num1==1 || num2==1){
                return ans + Math.max(num1, num2);
            }
        }
        return ans;
    }
}
