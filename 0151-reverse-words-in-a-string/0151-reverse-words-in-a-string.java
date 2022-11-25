class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        String res = "";
        for(int i = strArr.length-1; i>=0; i--){
            if(!strArr[i].isEmpty())
                res = res+" "+strArr[i];
        }
        return res.trim();
    }
}