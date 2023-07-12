class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int max =0;
        while(left<right) {
            int width = right-left;
            max = Math.max(max, Math.min(height[right], height[left])*width);
            if(height[right]>= height[left])
                left++;
            else
                right--;
        }
        return max;

    }
}


