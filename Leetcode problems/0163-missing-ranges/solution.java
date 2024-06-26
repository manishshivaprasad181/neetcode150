class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result=new ArrayList<String>();
        int prev=lower-1;
        for(int i=0;i<=nums.length;i++)
        {
            int curr=(i<nums.length)?nums[i]:upper+1;
            if(prev+1 <= curr-1)
            {
                result.add(formatrange(prev+1,curr-1));
            }
            prev=curr;
        }
        return result;
        
    }
    public String formatrange(int lower,int upper){
        if(lower==upper)
        {
            return String.valueOf(lower);
        }
        return lower+"->"+upper;
    }
    

    
}
