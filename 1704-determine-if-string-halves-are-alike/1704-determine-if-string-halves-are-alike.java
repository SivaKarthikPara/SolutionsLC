class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int len = s.length();
        String s1 = s.substring(0, len / 2), s2 = s.substring(len / 2, len);
        int c1 = 0, c2 = 0;
        for (int i = 0; i < len / 2; i++) {
            if (vowels.contains(s1.charAt(i) + "")) {
                c1++;
            }
            if (vowels.contains(s2.charAt(i) + "")) {
                c2++;
            }
        }

        return c1 == c2;
    }
}