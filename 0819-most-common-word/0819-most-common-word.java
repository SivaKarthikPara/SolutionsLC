class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String [] arr = paragraph.toLowerCase().split("[^a-zA-Z]");
        List<String> bannedList = Arrays.asList(banned);
        Map<String, Integer> wordFreq = new HashMap<>();
        for(String s : arr){
            if(bannedList.contains(s) || s.isEmpty())
                continue;
            wordFreq.put(s, wordFreq.getOrDefault(s,0)+1);
        }
        System.out.println(wordFreq);
        int max = 0;
        String res = "";
        for(String s : wordFreq.keySet()){
            if(max < wordFreq.get(s)){
                max = wordFreq.get(s);
                res = s;
            }
        }
        return res;
    }
}