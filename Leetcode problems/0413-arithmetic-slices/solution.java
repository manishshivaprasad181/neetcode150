class Solution {
    int sum =0;
    public int numberOfArithmeticSlices(int[] nums) {
        slices(nums, nums.length-1);
        return sum;
    }

    public int slices(int[] nums, int i) {
        if(i<2)
            return 0;
        int ap =0;
        if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2])  {
              ap = 1+slices(nums, i-1);
              sum+= ap;
          
        }
        else 
            slices(nums, i-1);
        return ap;
    }
}
