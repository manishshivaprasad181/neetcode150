class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] freq1=new int[26];
        int[] freq2 =new int[26];
        for(int i=0;i<n;i++)
        {
            freq1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++)
        {
            freq2[s2.charAt(i)-'a']++;
            if(i>=n)
            {
                freq2[s2.charAt(i-n)-'a']--;
            }
            if(Arrays.equals(freq1,freq2))
            return true;
        }
        return false;
    }
}
