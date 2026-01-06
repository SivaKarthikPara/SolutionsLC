class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = greaterElement(nums2, nums1[i]);
        }
        return result;
    }

    public int greaterElement(int[] nums, int num) {
        int index = -1;

        // Find index of num in nums2
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                index = i;
                break;
            }
        }

        for (int i = index + 1; i < nums.length; i++) {
            if (num < nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}