class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int m = 0;
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            m = Math.max(m,map.get(c));
        }
        System.out.println(map);
        List<Character> [] bucket = new List[m+1];
        for(char c: map.keySet()){
            int freq = map.get(c);
            if(bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(c);
        }
        System.out.println(Arrays.toString(bucket));
        String res = "";
        for(int i = m; i >= 0; i--){
            if(bucket[i] == null)
                continue;
            int n = bucket[i].size();
            int n1 = 0;
            int j = 0;
            while(n1<n){
                int k = i;
                while(k>0){
                    res+=bucket[i].get(j);
                    k--;
                }
                j++;
                n1++;
            }
        }
        return res;
    }
}