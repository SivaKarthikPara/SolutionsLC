class Solution {
    //good approach --> https://walkccc.me/LeetCode/problems/2032/
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> list3 = Arrays.stream(nums3).boxed().collect(Collectors.toList());
        
        Set<Integer> unionOfLists = new HashSet<>();
        unionOfLists.addAll(list1);
        unionOfLists.addAll(list2);
        unionOfLists.addAll(list3);
        
        List<Integer> ans = new ArrayList<>();
        
        for(Integer i : unionOfLists){
            int c = 0;
            if(list1.contains(i)) c++;
            if(list2.contains(i)) c++;
            if(list3.contains(i)) c++;
            
            if(c>=2) ans.add(i);
        }
        
        return ans;
    }
}