class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] words = s.split(" ");
       Map<Character, String> map = new HashMap<>();
       if(pattern.length()!=words.length)
            return false;

        for(int i=0;i<pattern.length();i++) {
            char c  = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(c))  {
                if(!map.get(c).equals(word)) 
                    return false;
        
            } else {
                if(map.containsValue(word))
                    return false;
                map.put(c, word);
            } 
        }
        return true;
    } 
}
