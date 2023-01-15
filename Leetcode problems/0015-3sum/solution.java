class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> res = new ArrayList<>();
       for(int i =0;i<nums.length;i++){
           if(i==0|| nums[i-1]!=nums[i]) 
                twosum(nums, i, res);
       }
    return res;
    }
    void twosum(int[] nums, int i , List<List<Integer>> res) {
        int lo =i+1;
        int hi = nums.length-1;
        while(lo<hi) {
            int sum = nums[i] + nums[lo]+ nums[hi];
            if(sum<0)
                ++lo;
            else if(sum>0)
                --hi;
            else {
                res.add(Arrays.asList(nums[i],nums[lo++],nums[hi--]));
                while(lo<hi &&nums[lo-1] == nums[lo])
                    ++lo;
            }
        }
    }
}
