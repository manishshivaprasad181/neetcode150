class NumArray {
    public int[] myarray;
    public NumArray(int[] nums) {
        myarray=new int[nums.length];
        myarray[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            myarray[i]=myarray[i-1]+nums[i];
        }

    }
    
    public int sumRange(int left, int right) {
        if(left==0)
        return myarray[right];
        else
        return myarray[right]-myarray[left-1];










    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
