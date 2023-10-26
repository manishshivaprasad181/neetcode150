class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> sortednums=new TreeSet<Integer>();
        for(int num:nums)
        {
            if(sortednums.contains(num))
            continue;
            if(sortednums.size()==3)
            {
                if(sortednums.first()<num)
                {
                    sortednums.pollFirst();
                    sortednums.add(num);
                }
            }
            else
            sortednums.add(num);
            
        }
        if(sortednums.size()==3)
        return sortednums.first();

        return sortednums.last();

    }
}
