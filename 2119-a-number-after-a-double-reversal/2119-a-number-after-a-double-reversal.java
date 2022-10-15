class Solution {
    public boolean isSameAfterReversals(int num) {
        int firstRev = reverse(num);
        int secondRev = reverse(firstRev);
        
        if(num == secondRev)
            return true;
        return false;
    }
    
    public static int reverse(int num){
        int rev = 0;
        while(num>0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}