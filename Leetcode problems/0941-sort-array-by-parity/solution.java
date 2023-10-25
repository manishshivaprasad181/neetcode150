class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            while(start<end && nums[start]%2==0)
                start++;
            while(start<end && nums[end]%2==1)
                end--;
            swap(start,end,nums);
            start++;
            end--;
        }
        return nums;
    }
    public void swap(int start,int end, int[] nums)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
