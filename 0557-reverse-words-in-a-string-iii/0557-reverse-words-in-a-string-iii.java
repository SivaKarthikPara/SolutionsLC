class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        String res = "";
        for(String str : arr){
          res += " "+new StringBuilder(str).reverse();
        }
        return res.trim();
    }
}