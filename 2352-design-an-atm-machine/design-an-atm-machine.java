class ATM {
    int[] bal;
    int[] denoms;

    public ATM() {
        bal = new int[5];
        denoms = new int[]{20, 50, 100, 200, 500};
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0;i<5;i++){
            bal[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] with = new int[5];
        int index = 4;

        while(amount>0 && index>=0){
            int takenote = Math.min(amount/denoms[index] , bal[index]);
            amount -= takenote * denoms[index];
            with[index] += takenote;
            index--;
        }

        if(amount == 0){
            for(int i = 0;i<5;i++){
                bal[i] -= with[i];
            }
            return with;
        }else{
            return new int[]{-1};
        }
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */

