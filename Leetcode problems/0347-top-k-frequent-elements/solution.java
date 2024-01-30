class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count=new HashMap<>();
        List<Integer>[] freq=new ArrayList[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<freq.length;i++)
        {
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            int n=entry.getKey();
            int c=entry.getValue();
            freq[c].add(n);
        }
        int[] res=new int[k];
        int j=0;
        for(int i=freq.length-1;i>0;i--){
            for(int n:freq[i]){
            res[j++]=n;
            if(j>=k)
            return res;
            
            
            }
        }
        return res;
    }
}
