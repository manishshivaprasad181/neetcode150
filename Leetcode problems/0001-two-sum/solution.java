import java.util.Hashtable;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> ht=new Hashtable<>();
        for(int i=0;i<nums.length;i++)
        {   
            int comp=target-nums[i];
            if(ht.containsKey(comp))
            return new int[]{i,ht.get(comp)};
            else
            ht.put(nums[i],i);
        }
        return null;
    }
}
