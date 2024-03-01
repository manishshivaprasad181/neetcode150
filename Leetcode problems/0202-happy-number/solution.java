class Solution {
    public int getNum(int n) {
        int totalSum=0;
        while(n!=0) {
            int d = n%10;
            n= n/10;
            totalSum+= d*d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n!=1 && !seen.contains(n)) {
            seen.add(n);
            n = getNum(n);
        }
        return n==1;
        
    }
}
