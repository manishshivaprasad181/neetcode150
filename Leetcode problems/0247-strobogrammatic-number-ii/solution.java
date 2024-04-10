class Solution {
    public char[][] reversiblePairs = {{'0','0'},{'1','1'},{'8','8'},{'6','9'},{'9','6'}};

    public List<String> generateStrobo(int n , int finalLength) {
        if(n==0)
            return new ArrayList<>(List.of(""));
        if(n==1)
            return new ArrayList<>(List.of("0","1","8"));
        
        List<String> prevStrobo = generateStrobo(n-2, finalLength);
        List<String> currStrobo = new ArrayList<>();

        for(String prevStrobonum:prevStrobo) {
            for(char[] pair:reversiblePairs) {
                if(pair[0]!='0' || n!= finalLength) {
                    currStrobo.add(pair[0]+prevStrobonum+pair[1]);
                }
            }
        }
        return currStrobo;
    }
    public List<String> findStrobogrammatic(int n) {
        return generateStrobo(n,n);
    }
}
