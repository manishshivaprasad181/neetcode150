class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
        return 0;
        int [] maxrobbed=new int[n+1];
        maxrobbed[n]=0;
        maxrobbed[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            maxrobbed[i]=Math.max(maxrobbed[i+1],maxrobbed[i+2]+nums[i]);
        }
        return maxrobbed[0];
    }
}
