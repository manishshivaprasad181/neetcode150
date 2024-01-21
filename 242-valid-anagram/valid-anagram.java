class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s_array= new int[26];
        for(int i=0;i<s.length();i++)
        {
            s_array[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            s_array[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(s_array[i]!=0)
            return false;
        }
        return true;

    
    }
}