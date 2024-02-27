class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm = new HashMap<>();
        Stack<Character> st = new Stack<>();

        hm.put('}','{');
        hm.put(']','[');
        hm.put(')','(');

        for(int i=0;i<s.length();i++) {
            if(!hm.containsKey(s.charAt(i)))
                st.push(s.charAt(i));
            else {
                if(!st.isEmpty() && st.peek()== hm.get(s.charAt(i)))
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}
