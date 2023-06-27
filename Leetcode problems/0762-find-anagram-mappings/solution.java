class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] mapping = new int[nums1.length];
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for(int i =0;i<nums2.length;i++) {
            numToIndex.put(nums2[i], i);
        }
        
        for(int i=0;i<nums1.length;i++) {
            mapping[i]  = numToIndex.get(nums1[i]);
        }
        return mapping;
        
    }
}
