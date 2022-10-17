class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] arr = new int[26];
        int i = 0;
        while(i<sentence.length()){
            arr[sentence.charAt(i)-'a']++;
            i++;
        }
        for(int j: arr){
            if(j == 0)
                return false;
        }
        return true;
    }
}