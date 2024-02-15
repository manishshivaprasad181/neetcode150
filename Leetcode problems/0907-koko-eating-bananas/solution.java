class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=1;
        for(int pile:piles)
            right=Math.max(right,pile);
        while(left<right)
        {
            int middle=(right+left)/2;
            int hourspent=0;
            for(int pile:piles){
                hourspent+=Math.ceil((double)pile/middle);
            }
            if(hourspent<=h)
            right=middle;
            else
            left=middle+1;
        }
        return right;

    }
}
