class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int left =0;
       int right =0;
       for(int i=0;i<weights.length;i++) {
           left = Math.max(left, weights[i]);
           right+= weights[i];
       }

       while(left<right) {
           int mid = (left+right)/2;
           int requireddays =1;
           int currentWeight =0;
           for(int weight:weights) {
               if(currentWeight+weight>mid) {
                   currentWeight=0;
                   requireddays++;
               }
               currentWeight+= weight;

           }
           if(requireddays<=days)
                right = mid;
            else
                left =mid+1;
       }
       return left;
    }
}
