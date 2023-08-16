class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];

        int posIdx =0;
        int negIdx =0;
        for(int num: nums) {
            if(num<0)
                negative[negIdx++] = num;
            else
            positive[posIdx++] = num;
           
        }

        int i =0;
        int posPtr =0;
        int negPtr=0;
        result[i++] = positive[posPtr++];
        while(i<n) {
            if(i%2==1)
                result[i++] = negative[negPtr++];
            else 
                result[i++] = positive[posPtr++];
        }
        return result;
    }
}
