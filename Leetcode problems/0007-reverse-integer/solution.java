class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        long reverse =0;
        if(x<0)
        {
            isNegative = true;
            x=-x;
        }
        while(x>0) {
            reverse = reverse*10+ x%10;
            x = x/10;
        }
        if(reverse>Integer.MAX_VALUE)
            return 0;
        return (int) (isNegative?-reverse:reverse);
    }
}
