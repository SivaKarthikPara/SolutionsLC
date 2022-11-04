class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int l = 0, r = c.length-1;
        
        while(l<r){
            while(!(c[l]=='a'||c[l]=='e'||c[l]=='i'||c[l]=='o'||c[l]=='u'||c[l]=='A'||c[l]=='E'||c[l]=='I'||c[l]=='O'||c[l]=='U')){
                if(l>=r)
                    break;
                l++;
            }
            while(!(c[r]=='a'||c[r]=='e'||c[r]=='i'||c[r]=='o'||c[r]=='u'||c[r]=='A'||c[r]=='E'||c[r]=='I'||c[r]=='O'||c[r]=='U')){
                if(l>=r)
                    break;
                r--;
            }
            if(l<r){
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
        }
        
        return new String(c);
    }
}