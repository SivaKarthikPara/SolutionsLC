class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch, right);
            }else{
                left = Math.max(left, map.get(ch) + 1);
                map.put(ch, right);
                
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}