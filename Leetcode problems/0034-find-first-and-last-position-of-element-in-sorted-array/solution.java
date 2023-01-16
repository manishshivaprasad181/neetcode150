class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurence = this.foundBound(nums, target, true);
        if(firstOccurence==-1) 
            return new int[]{-1,-1};
        int lastOccurence = this.foundBound(nums, target, false);
        return new int[]{firstOccurence, lastOccurence};
    }
    private int foundBound(int[] nums, int target, boolean isFirst) {
        int begin =0;
        int end = nums.length-1;
        while(begin<=end) {
            int mid = (begin+end)/2;
            if(nums[mid]== target) {
                if(isFirst) {
                    if(mid==begin|| nums[mid-1]!= target) 
                        return mid;
                end = mid-1;
                } else {
                    if(mid==end||nums[mid+1]!= target) 
                        return mid;
                begin = mid+1;
                }
            } else if(nums[mid]>target) {
                end = mid-1;
            } else {
                begin = mid+1;
            }
        }
        return -1;
    }
}

