class Solution {
    public String intToRoman(int num) {
        String [] romanArr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] intArr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String res = "";
        int i = 0;
        while(num!=0){
            while(num>=intArr[i]){
                res = res+romanArr[i];
                num = num - intArr[i];
            }
            i++;
        }
        return res;
    }
}