class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        char [] charArr = Integer.toBinaryString(z).toCharArray();
        int res = 0;
        for(char c: charArr){
            if(c == '1')
                res++;
        }
        return res;
    }
}