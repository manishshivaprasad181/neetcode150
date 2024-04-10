class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> seen = new HashSet<>();
        HashMap<Character, Integer> last_occurence = new HashMap<>();

        for(int i=0;i<s.length();i++) last_occurence.put(s.charAt(i),i);

        for(int i=0;i<s.length();i++) {
            if(!seen.contains(s.charAt(i))) {

                while(!stack.isEmpty() && s.charAt(i)<stack.peek() && last_occurence.get(stack.peek())>i)
                {
                    seen.remove(stack.pop());
                }
                seen.add(s.charAt(i));
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch:stack) sb.append(ch.charValue());
        return sb.toString();
    }
}
