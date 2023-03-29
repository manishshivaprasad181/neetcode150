class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int length=0;
        boolean odd=false;
        for (int f:hm.values())
        {
            if(f%2==0)
            length+=f;
            else
           {
            length+=f-1;
            odd=true;
           }
        }
        if(odd)
        length+=1;
         return length;
    }
   
}
