class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        HashMap<Character,Character> closetopen=new HashMap<>();
        closetopen.put(')','(');
        closetopen.put('}','{');
        closetopen.put(']','[');
        for(int i=0;i<s.length();i++)
        {
            if(closetopen.containsKey(s.charAt(i)))
            {
                if(!st.isEmpty() && st.peek()==closetopen.get(s.charAt(i)))
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
