class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] arr = sentence.split(" ");
        int i = 0;
        for(String s : arr){
            i++;
            if(s.startsWith(searchWord))
                return i;
        }
        return -1;
    }
}