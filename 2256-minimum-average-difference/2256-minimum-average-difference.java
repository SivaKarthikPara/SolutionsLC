class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0, leftSum = 0;
        for (int i : nums)
            sum += i;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if ((i + 1) != nums.length)
                arr[i] = (int)Math.abs(leftSum / (i + 1) - (sum - leftSum) / (nums.length - i - 1));
            else
                arr[i] = (int)Math.abs(leftSum / (i + 1) - (sum - leftSum));
        }

        int min = Arrays.stream(arr).min().orElseThrow();
        int minIndex = Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(min);
        return minIndex;

    }
}