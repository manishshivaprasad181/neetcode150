class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sum_array=0;
        for(int i:nums)
        {
            sum_array+=i;
        }
        return sum-sum_array;
    }
}
