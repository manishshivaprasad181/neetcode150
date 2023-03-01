class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(hm.containsKey(diff))
                return new int[]{i,hm.get(diff)};
            else
                hm.put(nums[i],i);
        }
        return null;
        
    }
}
