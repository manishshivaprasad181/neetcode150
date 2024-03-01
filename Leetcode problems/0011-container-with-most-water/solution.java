class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxAmount=0;

        while(left<right) {
            maxAmount = Math.max(Math.min(height[left], height[right])*(right-left), maxAmount);

            if(height[left]<height[right])
                left++;
            else
                right--;    
        }
        return maxAmount;
    }
}
