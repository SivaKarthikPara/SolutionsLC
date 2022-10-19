class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        List<String> result = new ArrayList<>();
        
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(k,
                (a, b) -> a.getValue() != b.getValue() ? b.getValue() - a.getValue()
                        : a.getKey().compareTo(b.getKey()));
        
        for(Map.Entry<String, Integer> set : map.entrySet()) {
            maxHeap.add(set);
        }

        while (k > 0) {
            result.add(maxHeap.poll().getKey());
            k--;
        }
        return result;
    }
}