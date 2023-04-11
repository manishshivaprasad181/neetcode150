class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
            return false;
        for(int factor: new int[] {2,3,5}) {
            n = keepDividingWhenDivisible(n,factor);
        }
        return n ==1;
        
    }
    private int keepDividingWhenDivisible(int divident, int divisor) {
        while(divident%divisor==0) {
            divident/=divisor;
        }
        return divident;
    }
}
