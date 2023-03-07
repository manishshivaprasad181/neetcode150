class Solution {
    public int maxSubArray(int[] nums) {
        int currentsubarray=nums[0];
        int maximumsubarray=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int num=nums[i];
            currentsubarray=Math.max(num,currentsubarray+num);
            maximumsubarray=Math.max(currentsubarray,maximumsubarray);
        }
        return maximumsubarray;
        
    }
}
