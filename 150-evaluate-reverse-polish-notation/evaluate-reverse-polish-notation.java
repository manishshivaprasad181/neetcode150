class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st=new Stack<>();
       HashSet<String> hs=new HashSet<>();
       hs.add("+");
       hs.add("*");
       hs.add("/");
       hs.add("-");
       for(int i=0;i<tokens.length;i++)
       {
           if(!hs.contains(tokens[i]))
           {
               st.push(Integer.parseInt(tokens[i]));
           }
           else
           {
               if(tokens[i].equals("+"))
               {
                   st.push(st.pop()+st.pop());
               }
               else if(tokens[i].equals("-"))
               {
                   int x=st.pop();
                   int y=st.pop();
                   st.push(y-x);
               }
               else if(tokens[i].equals("*"))
               {
                   st.push(st.pop()*st.pop());

               }
               else
               {
                   int x=st.pop();
                   int y=st.pop();
                   st.push(y/x);
               }
           }
       }
       return st.pop(); 
    }
}