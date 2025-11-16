class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (e1,e2) -> Integer.compare(e1[0], e2[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int[] next = nums[i];
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(current);
                current = next;
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}