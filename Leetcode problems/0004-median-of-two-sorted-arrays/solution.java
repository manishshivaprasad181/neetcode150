class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1 = nums1.length;
        int s2 = nums2.length;
        double[] temp = new double[s1+s2];
        int i=0,j=0,k=0;
        while(i<s1&&j<s2) {
            if(nums1[i]<nums2[j]) {
                temp[k] = nums1[i];
                k++;
                i++;
            } else {
                temp[k] = nums2[j];
                k++;
                j++;
            }
        }
        if(i>=s1) {
            for(int m =j;m<s2;m++) {
                temp[k] = nums2[m];
                k++;
            }
        }
        if(j>=s2) {
            for(int n =i;n<s1;n++) {
                temp[k] = nums1[n];
                k++;
            }
        }
        double ans=0.0;
        if(temp.length%2!=0) {
            ans = temp[temp.length/2];

        }  else {
            ans = (temp[temp.length/2] +temp[temp.length/2-1])/2;
        }
        return ans;

    }
}
