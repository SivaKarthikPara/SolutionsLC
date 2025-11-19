class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> list = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toList());
        while(list.contains(original))
            original *= 2;
        return original;
    }
}