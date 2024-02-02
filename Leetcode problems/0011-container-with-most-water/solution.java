class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int amount=0;
        while(l<r)
        {
            amount=Math.max(Math.min(height[l],height[r])*(r-l),amount);
           
            if(height[l]<=height[r])
            l++;
            else
            r--;
        }
        return amount;
    }
}
