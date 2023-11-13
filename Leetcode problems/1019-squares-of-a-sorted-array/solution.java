class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int k=nums.length-1;
        int[] result=new int[nums.length];
        while(left<=right)
        {
            if(Math.abs(nums[right])>Math.abs(nums[left]))
           { 
               result[k--]=nums[right]*nums[right];
               right--;
           }
           else
           {
               result[k--]=nums[left]*nums[left];
               left++;
           }
        }
        return result;

    }
}
