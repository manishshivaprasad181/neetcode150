class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int matched=0;
        int minlen=s.length()+1;
        int start=0;
        int substr=0;
        for(int endwindow=0;endwindow<s.length();endwindow++)
        {
            char right=s.charAt(endwindow);
            if(map.containsKey(right)){
            map.put(right,map.get(right)-1);
            if(map.get(right)==0)
            matched++;
            }
            while(matched==map.size())
            {
                if(minlen>endwindow-start+1){
                    minlen=endwindow-start+1;
                    substr=start;
                }
                char deleted=s.charAt(start++);
                if(map.containsKey(deleted)){
                    if(map.get(deleted)==0)matched--;
                    map.put(deleted,map.get(deleted)+1);
                }

                
            }
        }
        return minlen>s.length()?"":s.substring(substr,substr+minlen);
    }
}
