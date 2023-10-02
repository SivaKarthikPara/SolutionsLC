class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> vowels = new ArrayList<>();
        for(char c : s.toCharArray())
            if(isVowel(c))
                vowels.add(c);
        Collections.sort(vowels);
        for(int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c = isVowel(c)? vowels.get(j++) : c;
            sb.append(c);
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}