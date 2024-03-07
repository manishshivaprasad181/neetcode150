class Solution {
    public int maxSubArray(int[] nums) {
        int currsubarray=nums[0];
        int maxsubarray=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currsubarray=Math.max(currsubarray+nums[i],nums[i]);
            maxsubarray=Math.max(currsubarray,maxsubarray);
        }

        return maxsubarray;
    }
}