class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> stringCount = new HashMap<>();
        Map<String, Integer> doubleCount = new HashMap<>();
        for(String s:words){
            if(s.charAt(0) != s.charAt(1))
                stringCount.put(s,stringCount.getOrDefault(s,0)+1);
            else
                doubleCount.put(s,doubleCount.getOrDefault(s,0)+1);
        }
        int maxLen = 0;
        StringBuilder res = new StringBuilder();
        for(Map.Entry<String, Integer> m : stringCount.entrySet()){
            int value = m.getValue();
            String key = m.getKey();
            String revKey = new StringBuilder(key).reverse().toString();
            if(!stringCount.containsKey(revKey)) continue;
            int revValue = stringCount.get(revKey);
            maxLen += 4 * (Math.min(value, revValue));
            stringCount.put(key,0);
        }

        boolean leftOvers = false;
        for(Map.Entry<String, Integer> m : doubleCount.entrySet()){
            int value = m.getValue();
            String key = m.getKey();
            if(value %2 ==0)
                maxLen += 2 * value;
            else{
                leftOvers = true;
                maxLen += 2 * value - 2;
            }
        }
        if(leftOvers)
            maxLen += 2;

        return maxLen;
    }
}