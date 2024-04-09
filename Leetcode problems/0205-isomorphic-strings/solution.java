class Solution {
    public String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            if(!indexMapping.containsKey(s.charAt(i)))
                indexMapping.put(s.charAt(i),i);
            
            builder.append(Integer.toString(indexMapping.get(s.charAt(i))));
            builder.append(" ");
        }
        return builder.toString();
    }
    public boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }
}
