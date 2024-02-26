class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> hm = new HashMap<>();

        for(String s:strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!hm.containsKey(key)) hm.put(key, new ArrayList<>());
            hm.get(key).add(s);
        }
        return new ArrayList(hm.values());
        
    }
}
