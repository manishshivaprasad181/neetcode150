class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        calculateSum(nums, runningsum, nums.length-1);
        return runningsum;
    }
    
    private int calculateSum(int[] nums, int[] runningsum, int index) {
        if(index==0) {
            runningsum[index] = nums[index];
            
        }
        else 
            runningsum[index] = nums[index] +calculateSum(nums, runningsum, index-1);
        return runningsum[index];
    }
}
