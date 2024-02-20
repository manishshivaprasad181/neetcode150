class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1=nums1.length;
        int s2=nums2.length;
        int i=0,j=0,k=0;
        double[] res=new double[s1+s2];
        while(i<s1 && j<s2)
        {
            if(nums1[i]>nums2[j])
            {
                res[k++]=nums2[j];
                j++;

            }
            else
            {
                res[k++]=nums1[i];
                i++;
            }

        }
        if(i>=s1)
        {
        for(int m=j;m<s2;m++)
        {
            res[k++]=nums2[m];
        }
        }
         if(j>=s2)
        {
        for(int m=i;m<s1;m++)
        {
            res[k++]=nums1[m];
        }
        }

        if(res.length%2!=0)
        {
            return res[res.length/2];
        }
        else
        {
            return (res[res.length/2]+res[res.length/2-1])/2;
        }

    }
}