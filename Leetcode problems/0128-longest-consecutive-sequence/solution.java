class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int longestseq=0;
        for(int i=0;i<nums.length;i++)
        hs.add(nums[i]);
        for(int num:hs){
            if(!hs.contains(num-1)){
                int currentnum=num;
                int currentseq=1;
                while(hs.contains(currentnum+1)){
                    currentnum+=1;
                    currentseq+=1;

                }
                longestseq=Math.max(longestseq,currentseq);
            }
        }
        
        return longestseq;
    }
}
