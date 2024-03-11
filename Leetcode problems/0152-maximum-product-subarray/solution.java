class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0)  return nums[0];
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result=max_so_far;
        for(int i=1;i<nums.length;i++) {
            int temp_max= Math.max(nums[i], Math.max(nums[i]*max_so_far, nums[i]*min_so_far));
            min_so_far = Math.min(nums[i], Math.min(nums[i]*max_so_far, nums[i]*min_so_far));
            max_so_far = temp_max;
            result= Math.max(max_so_far, result);
        }
        
        return result;
    }
}
