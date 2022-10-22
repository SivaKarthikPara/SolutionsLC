class Solution {
    public int totalMoney(int n) {
        int total = 0, week = 1, d = 1, money = 1;
        while(n>0){
            if(d == 8){
                d = 1;
                week++;
                money = week;
            }
            System.out.print(money+" ");
            total += money++;
            n--;
            d++;
        }
        return total;
    }
}