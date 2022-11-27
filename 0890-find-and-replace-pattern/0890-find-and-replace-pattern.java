class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(words[i].length() == pattern.length() && isMatch(words[i], pattern))
                list.add(words[i]);
        }
        return list;
    }
    
    public static boolean isMatch(String word, String pattern){
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            char c1 = word.charAt(i);
            char c2 = pattern.charAt(i);
            if(map.containsKey(c1)){
                if(!(map.get(c1)==c2))
                    return false;
            }else{
                if(map.containsValue(c2))
                    return false;
                map.put(c1,c2);
            }
        }   
        return true;
    }
    
}