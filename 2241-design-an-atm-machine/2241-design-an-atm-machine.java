class ATM {
    
    long [] notes = new long[5]; // changed from int to long because few tc's have lot of notes
    int [] denominations = {20, 50, 100, 200, 500};

    public ATM() {
        
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0; i < banknotesCount.length; i++){
            notes[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int [] res = new int[5];
        // int prevAmount = 0;
        // int [] temp = notes.clone();
        // while(amount > 0){
        //     if(amount == prevAmount){
        //         notes = temp;
        //         return new int[]{-1};
        //     }
        //     prevAmount = amount;
        //     if(amount >= 500 && notes[4] > 0){
        //         res[4]++;
        //         notes[4]--;
        //         amount -= 500;
        //     }else if(amount >=200 && notes[3] > 0){
        //         res[3]++;
        //         notes[3]--;
        //         amount -= 200;
        //     }else if(amount >= 100 && notes[2] > 0){
        //         res[2]++;
        //         notes[2]--;
        //         amount -= 100;
        //     }else if(amount >=50 && notes[1] > 0){
        //         res[1]++;
        //         notes[1]--;
        //         amount -= 50;
        //     }else if(amount >= 20 && notes[0] > 0){
        //         res[0]++;
        //         notes[0]--;
        //         amount -= 20;
        //     }
        // }
        
        for(int i = 4; i >= 0; i--){
            res[i] = (int)Math.min(notes[i], amount/ denominations[i]);
            amount -= res[i] * denominations[i];
        }
        if(amount != 0)
            return new int[]{-1};
        for(int i = 0; i < 5; i++){
            notes[i] -= res[i];
        }
        return res;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */