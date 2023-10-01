class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int i = 0;
        for(; i < word1.length()&& i < word2.length(); i++){
            res += ""+word1.charAt(i)+word2.charAt(i);
        }

        if(word1.length() > i)
            res += word1.substring(i);
        if(word2.length() > i)
            res += word2.substring(i);
        return res;
    }
}