class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums,0,0,target);
        return count;
    }
    public void backtrack(int[] nums,int i,int sum,int target)
    {
        if(i==nums.length)
        {
            if(sum==target)
            count++;
        }
        else
        {
            backtrack(nums,i+1,sum+nums[i],target);
            backtrack(nums,i+1,sum-nums[i],target);
        }
    }
}
