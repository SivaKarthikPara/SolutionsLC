class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        
        if(k==0)
            return;
        reverseArray(nums,0,nums.length-1-k);
        reverseArray(nums,nums.length-k,nums.length-1);
        reverseArray(nums,0,nums.length-1);
    }
    public static void reverseArray(int[] arr, int l, int h){
        while(l<h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
    // public void rotate(int[] nums, int k) {
    //     while(k>0){
    //         int first = nums[nums.length-1];
    //         for(int i = nums.length-1; i>0; i--){
    //             nums[i] = nums[i-1];
    //         }
    //         nums[0] = first;
    //         k--;
    //     }
    // }
}