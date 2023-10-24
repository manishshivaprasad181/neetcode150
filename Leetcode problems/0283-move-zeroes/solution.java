class Solution {
    public void moveZeroes(int[] nums) {
        int lastnonzerofound=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[lastnonzerofound++]=nums[i];
            }
        }
        for(int i=lastnonzerofound;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}
