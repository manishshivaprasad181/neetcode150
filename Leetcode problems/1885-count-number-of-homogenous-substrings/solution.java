class Solution {
    public int countHomogenous(String s) {
       int ans=0;
       int currstreak=0;
       int mod=(int)1e9 +7;
       for(int i=0;i<s.length();i++)
       {
           if(i==0||s.charAt(i)==s.charAt(i-1))
               currstreak++;
            else
            currstreak=1;

           
           ans=(ans+currstreak)%mod;
       }
        return ans;
    }
}
