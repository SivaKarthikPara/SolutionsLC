class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int[26];
        int maxFreq = 0, left = 0, maxWindow = 0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq, freq[ch-'A']);
            int windowSize = right - left + 1;
            if(windowSize - maxFreq > k) {
                freq[s.charAt(left)-'A']--;
                left++;
                windowSize--;
            }
            maxWindow = Math.max(maxWindow, windowSize);
        }

        return maxWindow;
    }
}