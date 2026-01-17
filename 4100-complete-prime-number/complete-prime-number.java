class Solution {
    public boolean isprime(int num){
        if(num==0 || num==1) return false;
        if(num==2 || num==3) return true;
        if(num%2==0) return false;

        for(int i = 3;i * 1L * i<=num;i+=2){
            if(num%i==0) return false;
        }
        return true;
    }

    public boolean completePrime(int num) {
        if(!isprime(num)) return false;

        String s = Integer.toString(num);

        for(int i = 1;i<=s.length();i++){
            int prefix = Integer.parseInt(s.substring(0, i));
            if(!isprime(prefix)) return false;
        }

        for(int i = 0;i<s.length();i++){
            int suffix = Integer.parseInt(s.substring(i));
            if(!isprime(suffix)) return false;
        }
        return true;
    }
}

