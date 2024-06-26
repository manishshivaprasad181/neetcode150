class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(0,0,"", n, res);
        return res;
    }
    public void backtrack(int open, int close, String str, int max,List<String> res) {
        if(str.length()>=max*2)  {
            res.add(str);
            return;

        }

        if(open<max) {
            backtrack(open+1, close, str+"(", max, res);
        }
        if(close<open) {
            backtrack(open, close+1, str+")", max, res);
        }
    }
}
