class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int insertindex=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]!=nums[i])
            {
                nums[insertindex]=nums[i];
                insertindex++;
            }
        }
        return insertindex;
    }
}
