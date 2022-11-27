class Solution {
    public int compress(char[] chars) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            count++;
            if(i+1>=chars.length || chars[i]!=chars[i+1]){
                sb.append(chars[i]);
                if(count>1)
                    sb.append(count);
                count = 0;
            }
        }
        System.out.println(sb.toString());
        for(int i = 0; (i < sb.length() && i<chars.length); i++)
            chars[i] = sb.charAt(i);
        return sb.length()<chars.length?sb.length():chars.length;
    }
}