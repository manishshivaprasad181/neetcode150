class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int difference=target-nums[i];
            if(hm.containsKey(difference))
            return new int[]{i,hm.get(difference)};
            else
            hm.put(nums[i],i);
        }
        return null;
    }
}
