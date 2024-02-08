class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right =1;

        for(int pile:piles) 
            right = Math.max(right, pile);

        while(left<right) {
            int hourSpent =0;
            int middle = (left+right)/2;

            for(int pile:piles) {
                hourSpent+= Math.ceil((double)pile/middle);
            }
            
            if(hourSpent<=h)
                right = middle;
            else
                left = middle+1;
        }
        return right;
    }
}
