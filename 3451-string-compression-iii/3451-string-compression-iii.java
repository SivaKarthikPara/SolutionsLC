class Solution {
    public String compressedString(String word) {
        String comp = "";

        for(int i = 0; i < word.length(); ){
            char ch = word.charAt(i);
            int j = i+1;
            int count = 1;
            while(count<9 && j < word.length() && ch == word.charAt(j)){
                j++;
                count++;
            }

            i = j;
            comp = comp + count + ch;
        }

        return comp;
    }
}