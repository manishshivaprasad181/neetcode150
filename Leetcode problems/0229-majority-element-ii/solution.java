class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 =0;
        int count2 =0;

        Integer candidate1 = null;
        Integer candidate2 = null;

        for(int n:nums) {
            if(candidate1!=null && candidate1==n)
                count1++;
            else if(candidate2!=null && candidate2==n)
                count2++;
            else if(count1==0) {
                candidate1=n;
                count1++;
            } else if(count2==0) {
                candidate2=n;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();

        count1=0;
        count2=0;

        for(int num:nums) {
            if(candidate1!=null && candidate1 ==num) count1++;
            if(candidate2!=null && candidate2==num) count2++;
        }

        if(count1> nums.length/3) result.add(candidate1);
        if(count2>nums.length/3) result.add(candidate2);
        
        return result;
    }
}
