class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < senders.length; i++){
            String [] arr = messages[i].split(" ");
            List<String> list = map.getOrDefault(senders[i], new ArrayList<>());
            Collections.addAll(list,arr);
            map.put(senders[i],list);
        }
        
        int max = 0;
        String ans = "";
        for(String s: map.keySet()){
            if(max < map.get(s).size()){
                max = map.get(s).size();
                ans = s;
            }else if(max == map.get(s).size() && ans.compareTo(s) < 0){ // checking if lexicographically greater and reassigning
                ans = s;
            }
        }
        
        return ans;
    }
}