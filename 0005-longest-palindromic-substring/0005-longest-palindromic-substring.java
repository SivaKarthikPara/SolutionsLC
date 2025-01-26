class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String result="";
        for(int i = 0; i<s.length();i++) {
            // considering odd length/palindromes
           int low = i, high = i;
           while(s.charAt(low) == s.charAt(high)) { 
                low--;
                high++;
                if(low == -1 || high == s.length())
                    break;
           }
            String palindrome = s.substring(low+1, high);
            if(result.length() < palindrome.length() ){
                result = palindrome;
            }

           // considering even length/palindromes
            low = i-1;
            high = i;
           while(low != -1 && s.charAt(low) == s.charAt(high)) { 
                low--;
                high++;
                if(low == -1 || high == s.length())
                    break;
           }
            palindrome = s.substring(low+1, high);
            if(result.length() < palindrome.length() ){
                result = palindrome;
            }
        }
        //  System.out.println(Arrays.deepToString(dp));
        return result;
    }
}