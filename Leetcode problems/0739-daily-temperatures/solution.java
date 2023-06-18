class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        Arrays.fill(res,0);
        Stack<Pair<Integer,Integer>> s=new Stack<>();
        for(int i=0;i<temperatures.length;i++)
        {
            while(!s.isEmpty() && temperatures[i]>s.peek().getKey())
            {
                Pair<Integer,Integer> pair=s.pop();
                int temp=pair.getKey();
                int index=pair.getValue();
                res[index]=i-index;
            }
            s.push(new Pair<>(temperatures[i],i));
        }
        return res;
    }
}
