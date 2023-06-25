class Solution {
    public int reverse(int x) {
       int reversed =0;
        while(x!=0) {
            int digit = x%10;
            int new_reversed = reversed*10+digit;
            
            if((new_reversed-digit)/10!=reversed) {
                return 0;
                
            }
            reversed = new_reversed;
            x=x/10;
        }
        return reversed;
    }
}
