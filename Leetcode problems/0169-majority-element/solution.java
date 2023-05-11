class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            hm.put(nums[i],1);
            else
            hm.put(nums[i],hm.get(nums[i])+1);
        }
        int max_value = Collections.max(hm.values());
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue()== max_value)
                return entry.getKey();
        }
        return 0;

    }
}
