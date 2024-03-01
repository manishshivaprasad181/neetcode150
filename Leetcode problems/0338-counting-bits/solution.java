class Solution {
    public int popCount(int x) {
        int count;
        for(count=0;x!=0;count++)
            x = x&x-1;
        return count;
    }

    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++)
            ans[i] = popCount(i);

        return ans;
    }
}
