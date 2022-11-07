class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        List<String> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            char[] c = s.toCharArray();
            if(s.charAt(i)=='6'){
                c[i] = '9';
            }else
                continue;
            String t = new String(c);
            list.add(t);
        }
        
        // System.out.println(list);
        
        int max = num;
        for(String i: list){
            if(max<Integer.parseInt(i))
                max = Integer.parseInt(i);
        }
        return max;
    }
}