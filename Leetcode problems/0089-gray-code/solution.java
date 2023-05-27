class Solution {
    public List<Integer> grayCode(int n) {
       List<Integer> result = new ArrayList<>();
       graycodehelper(result, n);
       return result;

    }
    private void graycodehelper(List<Integer> result, int n) {
        if(n==0) {
            result.add(n);
            return;
        }
        graycodehelper(result, n-1);
        int currentsequence = result.size();
        int mask = 1<<(n-1);
        for (int i = currentsequence-1;i>=0;i--) {
            result.add(result.get(i)|mask);
        }
    }
}
