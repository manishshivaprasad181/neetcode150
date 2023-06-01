class Solution {
    public int countQuadruplets(int[] nums) {
        int len=nums.length;
        int result=0;
        Map<Integer,Integer> count=new HashMap<>();
        count.put(nums[len-1]-nums[len-2],1);
        for(int i=len-3;i>0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                result+=count.getOrDefault(nums[i]+nums[j],0);
            }
            for(int k=len-1;k>i;k--)
            {
                count.put(nums[k]-nums[i],count.getOrDefault(nums[k]-nums[i],0)+1);
            }
        }
        return result;
    }
}
