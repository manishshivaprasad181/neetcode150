class Solution {
    public double binarExp(double x, long n) {
        if(n==0)
            return 1;
        if(n<0)
            return 1/binarExp(x, -1*n);
        if(n%2==1)
            return x*binarExp(x*x, (n-1)/2);
        else
            return binarExp(x*x, n/2);
    }
    public double myPow(double x, int n) {
        return binarExp(x, (long)n);
    }
}
