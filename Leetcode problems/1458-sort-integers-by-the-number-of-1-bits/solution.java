class Solution {
    public int[] sortByBits(int[] arr) {
       Integer[] sortedarr = Arrays.stream(arr).boxed().sorted((a,b)->{
           int counta= Integer.bitCount(a);
           int countb = Integer.bitCount(b);
           
           if(counta!= countb) {
               return counta-countb;
           } else
               return a-b;
       }).toArray(Integer[]::new);
        
        return Arrays.stream(sortedarr).mapToInt(Integer::intValue).toArray();
        
    }
}
