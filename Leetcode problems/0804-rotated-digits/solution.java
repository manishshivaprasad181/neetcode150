class Solution {
    public int rotatedDigits(int n) {
        int count =0;
        for(int i=1;i<=n;i++) {
            if(isgood(i)) 
                count++;
        }
        return count;
        
    }
    
    public boolean isgood(int num) {
        boolean validFound = false;
        while(num>0) {
            int digit = num%10;
            if(digit ==3 || digit ==7  || digit ==4 )
                return false;
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                validFound = true;
            }
                
            num= num/10;
        }
        return validFound;
    }
}
