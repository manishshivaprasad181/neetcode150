class Solution {
    public int maxSubArray(int[] nums) {
        int currsubarray=nums[0];
        int maxsubarray=nums[0];;
        for(int i=1;i<nums.length;i++)
        {
            int num=nums[i];
            currsubarray=Math.max(num,currsubarray+num);
            maxsubarray=Math.max(maxsubarray,currsubarray);
        }
        return maxsubarray;
    }
}
