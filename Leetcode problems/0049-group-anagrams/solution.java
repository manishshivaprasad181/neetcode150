class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> hm = new HashMap<>();

        for(String str: strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!hm.containsKey(key)) hm.put(key, new ArrayList<>());
            hm.get(key).add(str);
        }
        return new ArrayList(hm.values());
        
    }
}
