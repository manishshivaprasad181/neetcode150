class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Triangle=new ArrayList<List<Integer>>();
        Triangle.add(new ArrayList<>());
        Triangle.get(0).add(1);
        for(int rownum=1;rownum<numRows;rownum++)
        {
          List<Integer> row= new ArrayList<>();
          List<Integer> prevrow= Triangle.get(rownum-1);
          row.add(1);
          for(int j=1;j<rownum;j++)
          {
            row.add(prevrow.get(j-1)+prevrow.get(j));
          }
          row.add(1);
          Triangle.add(row);

          

        }
        return Triangle;
    }
}
