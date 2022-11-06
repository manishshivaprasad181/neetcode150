class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for(char ch: s.toCharArray()) {
            if(Character.isLetterOrDigit(ch))
                builder.append(Character.toLowerCase(ch));
        }
        
        String filteredString = builder.toString();
        String reverseString = builder.reverse().toString();
    
    return filteredString.equals(reverseString);
    }
    
}
