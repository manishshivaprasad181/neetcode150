class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Pair<Integer, Integer>> st = new Stack<>();

        for(int i=0;i<temperatures.length;i++) {
            while(!st.isEmpty() && temperatures[i]>st.peek().getKey()) {
                Pair<Integer, Integer> pair = st.pop();
                int index= pair.getValue();
                res[index] = i-index;
            }
            st.push(new Pair(temperatures[i], i));
        }
        return res;
        
    }
}
