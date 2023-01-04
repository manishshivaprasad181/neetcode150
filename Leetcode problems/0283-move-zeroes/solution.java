class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int numzeros=0;
        for(int i =0;i<len;i++)
        {
            if(nums[i]==0)
            {
                numzeros+=1;
            }
        }
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<len;i++)
        {
            if(!(nums[i]==0))
            {
                li.add(nums[i]);
            }
        }
        while(numzeros>0)
        {
            li.add(0);
            numzeros--;

        }
        for(int i=0;i<len;i++)
        {
            nums[i]=li.get(i);
        }
        
        
    }
}
