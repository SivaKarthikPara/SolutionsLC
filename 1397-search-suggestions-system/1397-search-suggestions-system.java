class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        Arrays.sort(products);
        for(int i = 0; i < searchWord.length(); i++){
            String str = searchWord.substring(0,i+1);
            List<String> list = new ArrayList<>();
            int c = 0;
            for(String prod : products){
                if(prod.length()>=str.length() && prod.substring(0,i+1).equals(str)&&c<3){
                    list.add(prod);
                    c++;
                }
            }
            res.add(list);
        }
        return res;
    }
}