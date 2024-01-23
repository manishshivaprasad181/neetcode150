class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        HashMap<Character, Character> hs = new HashMap<>();
        hs.put('}', '{');
        hs.put(')', '(');
        hs.put(']', '[');
        for(int i =0;i<s.length();i++) {
            if(hs.containsKey(s.charAt(i))) {
                if(!st.isEmpty() && st.peek() == hs.get(s.charAt(i)))
                    st.pop();
                else
                    return false;
            }
            else
                st.push(s.charAt(i));
        }
        return st.isEmpty();

    }
}
