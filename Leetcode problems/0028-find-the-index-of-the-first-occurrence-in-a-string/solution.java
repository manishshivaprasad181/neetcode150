class Solution {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        for(int window_start =0;window_start<=n-m;window_start++) {
            for(int i =0;i<m;i++) {
                if(needle.charAt(i)!=haystack.charAt(window_start+i)) 
                    break;
                if(i==m-1)
                    return window_start;
            }
        }
        return -1;
    }
}
