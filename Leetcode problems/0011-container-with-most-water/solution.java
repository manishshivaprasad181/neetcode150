class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(right>left)
        {
            int width=right-left;
            int area=Math.abs(Math.min(height[left],height[right])*width);
            max=Math.max(area,max);
            if(height[left]<=height[right])
            left++;
            else
            right--;
        }
        return max;
    }
}
