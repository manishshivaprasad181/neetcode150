class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        int longestStreak = 0;
        
        for(int num:nums) {
            num_set.add(num);
        }
        for(int num: num_set) {
            if(!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak =1;
                
                while(num_set.contains(currentNum+1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
