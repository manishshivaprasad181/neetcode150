class Solution {
    public int missingNumber(int[] nums) {
        int expectedsum=nums.length*(nums.length+1)/2;
        int sum=0;
        for(int num:nums)
        {
            sum=sum+num;
        }
        return expectedsum-sum;
        
        
    }
}
