class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result=new ArrayList<>();
        int k=0;
        for(int num:target)
        {
            while(k<num-1)
            {
                result.add("Push");
                result.add("Pop");
                k++;
            }
            result.add("Push");
            k++;
        }
        return result;
    }
}
