class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<tokens.length;i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/")|| tokens[i].equals("*")) {
                int first = s.pop();
                int second = s.pop();
                if(tokens[i].equals("+"))
                    s.push(first+second);
                else if(tokens[i].equals("-"))
                    s.push(second-first);
                else if(tokens[i].equals("*"))
                    s.push(first*second);
                else
                    s.push(second/first);
            } else
                s.push(Integer.parseInt(tokens[i]));
        }
        return s.peek();

    }
}
