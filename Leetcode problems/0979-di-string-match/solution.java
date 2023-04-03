class Solution {
    public int[] diStringMatch(String s) {
        int[] perm =new int[s.length()+1];
        int n=s.length();
        int left=0;
        int right=n;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='I')
            {
                perm[i]=left;
                left++;
            }
            else
            {
                perm[i]=right;
                right--;
            }
        }
        perm[n]=left;
        return perm;
    }
}
