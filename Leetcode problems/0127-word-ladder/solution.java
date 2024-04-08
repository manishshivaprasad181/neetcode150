class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        Set<String> words = new HashSet<>(wordList);
        queue.add(beginWord);
        words.add(beginWord);
        int level=0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for(int i=0;i<size;i++) {
                String currentString = queue.poll();
                if(currentString.equals(endWord)) return level;
                List<String> neighbors = neighbors(currentString);
                for(String neigh:neighbors) {
                    if(words.contains(neigh)) {
                        words.remove(neigh);
                        queue.add(neigh);
                    }
                }
            }
        }
        return 0;
    }
    public List<String> neighbors(String string) {
        char[] chars = string.toCharArray();
        List<String> result = new ArrayList<>();
        for(int i=0;i<chars.length;i++) {
            char temp = chars[i];
            for(char c='a';c<='z';c++) {
                chars[i] = c;
                String neighbor= new String(chars);
                result.add(neighbor);
            }
             chars[i] = temp;
        }
       return result;
    }
}
