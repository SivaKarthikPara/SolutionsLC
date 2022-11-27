class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= s.length()-p.length(); i++){
            String subs = s.substring(i,i+p.length());
            if(isAnagram(subs,p)){
                list.add(i);
            }
        }
        return list;
    }
    
    public static boolean isAnagram(String s, String p){
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[p.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}