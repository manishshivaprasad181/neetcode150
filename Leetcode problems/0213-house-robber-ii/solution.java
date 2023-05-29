class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return nums[0];
        int max1=rob_simple(nums,0,nums.length-2);
        int max2=rob_simple(nums,1,nums.length-1);
        return Math.max(max1,max2);
    }
    public int rob_simple(int [] nums,int start,int end)
    {
        int prevmax=0;
        int currmax=0;
        for(int i=start;i<=end;i++)
        {
            int temp=currmax;
            currmax=Math.max(prevmax+nums[i],currmax);
            prevmax=temp;
        }
        return currmax;
    }
}
