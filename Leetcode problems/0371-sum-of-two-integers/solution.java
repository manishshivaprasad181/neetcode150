class Solution {
    public int getSum(int a, int b) {
        int answer =0;
        int carry=0;
        while(b!=0) {
            answer  = a^b;
            carry = (a&b)<<1;
            a = answer;
            b= carry;
        }
        return a;
        
    }
}
