class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int maxAmount =0;
        while(i<j) {
            maxAmount = Math.max(Math.min(height[i],height[j])*(j-i), maxAmount);

            if(height[i]<height[j])
                i++;
            else 
                j--;
        }
        return maxAmount;
        
    }
}
