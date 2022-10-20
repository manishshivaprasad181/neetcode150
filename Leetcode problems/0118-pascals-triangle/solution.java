class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for(int rownum=1;rownum<numRows;rownum++)
        {
            List<Integer> currrow=new ArrayList<>();
            List<Integer> prevrow=triangle.get(rownum-1);
            currrow.add(1);
            for(int col=1;col<prevrow.size();col++){
                currrow.add(prevrow.get(col-1)+prevrow.get(col));
            }
            currrow.add(1);
            triangle.add(currrow);
            
        }
        return triangle;
        
    }
}
