class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int longestsequence=0;
        int left=0;
        int right=0;
        int numzeros=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            numzeros++;
            while(numzeros==2)
            {
                if(nums[left]==0)
                numzeros--;
                left++;
            }
            longestsequence=Math.max(longestsequence,right-left+1);
            right++;
        }
        return longestsequence;
    }
}
