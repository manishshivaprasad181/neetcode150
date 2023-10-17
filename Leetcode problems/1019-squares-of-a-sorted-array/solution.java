class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int k=nums.length-1;
        int [] result=new int[nums.length];
        while(right>=left)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                result[k--]=nums[left]*nums[left];
                left++;
            }
            else
            {
                result[k--]=nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}
