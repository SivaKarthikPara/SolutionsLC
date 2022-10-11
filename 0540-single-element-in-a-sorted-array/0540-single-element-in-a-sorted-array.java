class Solution {
   /*// O(n) --> linear approach
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        for(int i = 0; i < nums.length-1; i+=2){
            if(nums[i]!=nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
    
    // O(n) --> xor of all elements
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
    */
    //using binary search
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while(low < high){
            int mid = low+(high-low)/2;
            if(mid%2==1) mid--;
            
            if(nums[mid] == nums[mid+1])
                low = mid+2;
            else
                high = mid;
        }
        return nums[low];
    }
}