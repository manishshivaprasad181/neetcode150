class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10 ==0 && x!=0) 
        return false;
        int reversedNumber =0;
        while(x>reversedNumber) {
            reversedNumber = reversedNumber*10+x%10;
            x= x/10;
        }
        return reversedNumber==x || x== reversedNumber/10;
    }
}
