class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset=new HashSet<>();
        int longest=0;
        for(int num:nums)
        {
            numset.add(num);
        }
        for(int num:nums)
        {
            if(!numset.contains(num-1))
            {
                int length=0;
                while(numset.contains(length+num))
                   length+=1;
                longest=Math.max(length,longest);
            }
                
           
            
        }
        return longest;
    }
}