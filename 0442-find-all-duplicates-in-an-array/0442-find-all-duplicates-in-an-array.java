class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(!set.add(i)){
                list.add(i);
            }
        }
        return list;
    }
}