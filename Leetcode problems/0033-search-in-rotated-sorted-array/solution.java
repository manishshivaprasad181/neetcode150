class Solution {
    public int findrotateindex(int []nums,int left,int right)
    {
        if(nums[left]<nums[right])
            return 0;
        while(left<=right)
        {
            int pivot=(left+right)/2;
            if(nums[pivot]>nums[pivot+1])
                return pivot+1;
            else
            {
                if(nums[pivot]<nums[left])
                    right=pivot-1;
                else
                    left=pivot+1;
            }
        }
        return 0;
    }
    public int search(int[] nums,int left,int right,int target)
    {
        while(right>=left)
        {
            int mid=(right+left)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                right=mid-1;
            else
                left=mid+1;
            
            
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        
        int n=nums.length;
        if(n==1){
            if(nums[0]==target)
                return 0;
            else
                return -1;
        }
        int rotateindex=findrotateindex(nums,0,n-1);
        if(nums[rotateindex]==target)
            return rotateindex;
        if(rotateindex==0)
            return search(nums,0,n-1,target);
        if(target<nums[0])
            return search(nums,rotateindex,n-1,target);
        return search(nums,0,rotateindex,target);
                
            
        }
        
    }

