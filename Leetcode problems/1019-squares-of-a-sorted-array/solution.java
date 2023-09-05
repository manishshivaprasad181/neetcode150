class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int k=nums.length-1;
        int[] result=new int[k+1];
        while(left<=right)
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
