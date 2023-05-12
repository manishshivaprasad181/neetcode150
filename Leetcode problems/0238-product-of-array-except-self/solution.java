class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int product=1;
        left[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            product=product*nums[i-1];
            left[i]=product;
        }
        right[nums.length-1]=1;
        product=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            product=product*nums[i+1];
            right[i]=product;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}
