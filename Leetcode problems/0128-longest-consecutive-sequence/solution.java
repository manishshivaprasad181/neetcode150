class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> hs = new HashSet<>();

        int longseq =0;
        int currentnum,currentseq;
        for(int i=0;i<nums.length;i++) 
            hs.add(nums[i]);
        
        for(int num:hs) {
            if(!hs.contains(num-1))
            {
                currentnum = num;
                currentseq =1;
                while(hs.contains(currentnum+1)) {
                    currentnum+=1;
                    currentseq+=1;
                }
                longseq = Math.max(longseq, currentseq);
            }
        }

        return longseq;
    }
}
