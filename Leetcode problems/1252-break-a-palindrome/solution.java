class Solution {
    public String breakPalindrome(String palindrome) {
        int length=palindrome.length();
        if(length==1)
        return "";
        char [] palindromearray=palindrome.toCharArray();
        for(int i=0;i<length/2;i++)
        {
            if(palindromearray[i]!='a'){
                palindromearray[i]='a';
                return String.valueOf(palindromearray);
            }
        }
        palindromearray[length-1]='b';
        return String.valueOf(palindromearray);
        
    }
}
