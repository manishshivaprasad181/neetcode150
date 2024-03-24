class Solution {
    public int findDuplicate(int[] nums) {
        int tortoise=nums[0];
        int rabbit= nums[0];
        do
        {
            tortoise=nums[tortoise];
            rabbit=nums[nums[rabbit]];
        }while(rabbit!=tortoise);
        tortoise=nums[0];
        while(rabbit!=tortoise)
        {
            tortoise=nums[tortoise];
            rabbit=nums[rabbit];

        }
        return tortoise;
    
    }
}
