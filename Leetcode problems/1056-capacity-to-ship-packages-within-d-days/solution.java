class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left =0;
        int right =0;
        for(int weight:weights) {
            left = Math.max(left, weight);
            right+= weight;
        }
        while(left<right) {
            int mid = (left+right)/2;
            int currentWeight =0;
            int requireddays = 1;
            for(int weight: weights) {
            if(currentWeight+weight > mid) {
                currentWeight =0;
                requireddays++;
            }
                
            currentWeight+= weight;
        }
        
            if(requireddays<=days) {
                right =mid;
                
            } else
                left= mid+1;
            
        }
        
        return left;
    }
}
