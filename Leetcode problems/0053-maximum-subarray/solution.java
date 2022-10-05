class Solution {
    public int maxSubArray(int[] nums) {
        int currentSubsum= nums[0];
        int Maxsubsum = nums[0];
        
        for (int i =1; i<nums.length;i++)
        {
            int num = nums[i];
            currentSubsum = Math.max(num, currentSubsum+num);
            Maxsubsum = Math.max(Maxsubsum, currentSubsum);
        }
        return Maxsubsum;
    }
}
