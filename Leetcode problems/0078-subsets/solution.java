class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        output.add(new ArrayList<Integer>());
        for(int num:nums){
            List<List<Integer>> newsubsets=new ArrayList();
            for(List<Integer> curr:output){
                newsubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for(List<Integer> curr:newsubsets){
                output.add(curr);
            }
        }
        return output;
        
        
    }
}
