class Solution {
    public int climbStairs(int n) {
      if(n==1)
      return 1;
      if(n==2)
      return 2;
       int[] f=new int[n+1];
       f[0]=0;
       f[1]=1;
       f[2]=2;
       for(int i=3;i<n+1;i++)
       {
           f[i]=f[i-1]+f[i-2];
       } 
       return f[n];
    }
}
