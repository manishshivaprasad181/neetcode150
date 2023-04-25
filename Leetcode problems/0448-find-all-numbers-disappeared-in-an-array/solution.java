class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
            hm.put(i,0);
        }
        for(int i=0;i<n;i++)
        {
            
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==0)
            l.add(entry.getKey());
        }
        return l;*/
        for(int i=0;i<nums.length;i++)
        {
            int newIndex=Math.abs(nums[i])-1;
            if(nums[newIndex]>0)
                nums[newIndex]*=-1;

        
        }
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=nums.length;i++)
        {
            if(nums[i-1]>0)
            l.add(i);
        }
        return l;
    }
}
