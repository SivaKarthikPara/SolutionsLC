class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                list.add(c);
            }else{
                if(!list.isEmpty()){
                    char c1 = list.get(list.size()-1);
                    if( (c1 == '(' && c ==')')||(c1 == '{' && c =='}')||(c1 == '[' && c ==']'))
                        list.remove(list.size()-1);
                    else
                        return false;
                }else{
                    return false;
                }
            }
        }
        if(list.isEmpty())
            return true;
        return false;
    }
}