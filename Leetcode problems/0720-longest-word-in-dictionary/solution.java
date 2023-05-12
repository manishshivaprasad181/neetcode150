class Solution {
    public String longestWord(String[] words) {
        String ans="";
        Set<String> wordset = new HashSet<>();
        for(String word:words) wordset.add(word);

        for(String word:wordset)  {
            if(word.length()>ans.length() || word.length()==ans.length() &&word.compareTo(ans)<0) {
                boolean good = true;
                for(int i =1;i<word.length();i++) {
                    if(!wordset.contains(word.substring(0,i))) {
                        good = false;
                        break;
                    }
                }
                if(good) ans = word;
            }

        }
        return ans;
    }
}
