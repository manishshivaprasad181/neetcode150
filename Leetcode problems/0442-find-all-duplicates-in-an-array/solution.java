class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> result=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
           int element=Math.abs(nums[i]);
           if(nums[element-1]<0)
           result.add(element);
            else
           nums[element-1]*=-1;


       } 
       return result;
    }
}
