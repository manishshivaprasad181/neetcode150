class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>();

       for(int i=0;i<tokens.length;i++) {
           if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")) {
               int first = st.pop();
               int second = st.pop();

                if(tokens[i].equals("+"))
                    st.push(first+second);
                else if(tokens[i].equals("-"))
                    st.push(second-first);
                else if(tokens[i].equals("*"))
                    st.push(first*second);
                else
                    st.push(second/first);
           } else
                st.push(Integer.parseInt(tokens[i]));
    
       }
       return st.peek();
    }
}
