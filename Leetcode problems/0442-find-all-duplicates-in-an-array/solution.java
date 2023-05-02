class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num:nums) {
            if(nums[Math.abs(num)-1]<0)
                ans.add(Math.abs(num));
            else
                nums[Math.abs(num)-1]*= -1;
        }
        return ans;
    }
}
