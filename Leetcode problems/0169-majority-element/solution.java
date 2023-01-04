import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ht=new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(!ht.containsKey(nums[i]))
            {
                ht.put(nums[i],1);
            }
            else
            ht.put(nums[i],ht.get(nums[i])+1);
        }
        int maxvalue=Collections.max(ht.values());
        for (Map.Entry<Integer, Integer> entry :
             ht.entrySet()) {
 
            if (entry.getValue() == maxvalue) {
                return entry.getKey();

    }

}
 return 0;
    }
   
}
