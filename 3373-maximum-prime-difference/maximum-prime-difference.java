class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        int max = Arrays.stream(nums).max().getAsInt();
        boolean isprime[] = new boolean[max+1];
        isprime[1] = true;
        for(int  i = 2;i<=Math.sqrt(max);i++){
            for(int j = i*i;j<=max;j+=i){
                isprime[j] = true;
            }
        }

        System.out.print(Arrays.toString(isprime));


        int min_prime = -1 , max_prime = -1;
        boolean isflag = true;
        for(int i = 0;i<n;i++){
            if(isprime[nums[i]]==false){
                if(isflag){
                    min_prime = i;
                    isflag = false;
                }

                max_prime = i;
            }
        }
        System.out.print(min_prime);
        System.out.print(max_prime);
        if(min_prime==-1 || max_prime==-1){
            return 0;
        }else{
            return Math.abs(max_prime - min_prime);
        }
    }
}

