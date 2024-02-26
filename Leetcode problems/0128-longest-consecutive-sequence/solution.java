class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numset = new HashSet<>();

        for(int num:nums)
            numset.add(num);
        int longest = 0;

        for(int num:nums) {
            if(!numset.contains(num-1)) {
                int length =0;
                while(numset.contains(num+length)) 
                    length+=1;
                longest = Math.max(length, longest);
            }
        }
        return longest;
        
    }
}
