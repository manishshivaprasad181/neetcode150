class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> set = new HashSet<>();
        Stack<Integer> st = new Stack<>();

        set.add("+");
        set.add("-");
        set.add("/");
        set.add("*");

        for(int i=0;i<tokens.length;i++) {
            if(!set.contains(tokens[i]))
                st.push(Integer.parseInt(tokens[i]));
            else {
                if(tokens[i].equals("+"))
                    st.push(st.pop()+st.pop());
                else if(tokens[i].equals("-")) {
                        int x = st.pop();
                        int y = st.pop();
                        st.push(y-x);
                } else if(tokens[i].equals("*")) 
                    st.push(st.pop()*st.pop());
                else {
                    int x = st.pop();
                    int y = st.pop();
                    st.push(y/x);
                }
            }
        }
        return st.pop();
    }
}
