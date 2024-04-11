class Solution {
    public boolean isVowel(char c) {
        return c =='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' ||c=='O' ||c=='U';
    }

    public void swap(char[] ch, int x , int y) {
        char temp = ch[x];
        ch[x] = ch[y];
        ch[y] = temp;
    }

    public String reverseVowels(String s) {
        int start =0;
        int end = s.length()-1;

        char[] sch = s.toCharArray();
        while(start<end) {
            while(start<s.length() && !isVowel(s.charAt(start))) 
                start++;
            while(end>=0 && !isVowel(s.charAt(end)))
                end--;
            
            if(start<end) 
                swap(sch, start++, end--);
        }
        return new String(sch);
    }
}
