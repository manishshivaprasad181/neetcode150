class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(sortedNums[i]))
                map.put(sortedNums[i],i);    
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
        
    }
}
