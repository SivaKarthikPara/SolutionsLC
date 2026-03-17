class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Arrays.sort(products);
        for(int i = 0; i < searchWord.length(); i++) {
            String s = searchWord.substring(0, i+1);
            List<String> list = Arrays.asList(products).stream().filter( e -> e.startsWith(s))
            .limit(3).collect(Collectors.toList());
            result.add(list);
        }
        return result;
    }
}