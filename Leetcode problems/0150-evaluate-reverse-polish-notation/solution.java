class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+")||tokens[i].equals("*")||tokens[i].equals("/")||tokens[i].equals("-"))
            {
                int second=s.pop();
                int first=s.pop();
                if(tokens[i].equals("+"))
                    s.push(first+second);
                else if(tokens[i].equals("-"))
                    s.push(first-second);
                else if(tokens[i].equals("*"))
                    s.push(first*second);
                else
                    s.push(first/second);
                
            }
            else
                s.push(Integer.parseInt(tokens[i]));
        }
        return s.peek();
    }
}
