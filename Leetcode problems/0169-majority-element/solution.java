import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> ht = new HashMap<>();
        int n = nums.length;
        for(int i =0;i<n;i++) {
            if(!ht.containsKey(nums[i]))
                ht.put(nums[i],1);
            else   
                ht.put(nums[i], ht.get(nums[i])+1);
        }
        int max_value = Collections.max(ht.values());
        for(Map.Entry<Integer, Integer> entry : ht.entrySet()) {
            if(entry.getValue()== max_value)
                return entry.getKey();
        }
        return 0;

        

        
        


    }
   
}
