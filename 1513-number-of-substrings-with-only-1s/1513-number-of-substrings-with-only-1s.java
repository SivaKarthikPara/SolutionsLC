class Solution {
    public int numSub(String s) {
        int total = 0, consecutiveOnes = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                consecutiveOnes++;
            }
            else {
                consecutiveOnes = 0;
            }
            total = (total + (consecutiveOnes)) % ((int) 1e9 + 7);
        }
        return total;
    }
}