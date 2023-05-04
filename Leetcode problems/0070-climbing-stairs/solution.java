class Solution {
    public int climbStairs(int n) {
      if(n==1)
        return n;
      if(n==2)
        return n;
      int first =1;
      int second=2;
      for(int j=3;j<=n;j++) {
          int third = first+second;
          first= second;
          second=third;
      }
      return second;
    }
}
