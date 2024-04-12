class Solution {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack= new Stack<>();
        String[] directories = input.split("\n");
        stack.push(0);
        int maxLength =0;
        for(String directory:directories) {
            int level = directory.lastIndexOf("\t")+1;

            while(stack.size()> level+1) 
                stack.pop();

            stack.push(stack.peek()+directory.length()-level+1);
            if(directory.contains("."))
                maxLength = Math.max(stack.peek()-1,maxLength);
        }
            return maxLength;
    }
}
