class Solution {
    private int popcount(int x) {
        int count;
        for(count=0;x!=0;count++)
            x&=x-1;
        return count;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i=0;i<=n;i++) {
            ans[i]= popcount(i);
        }
        return ans;
    }
}
