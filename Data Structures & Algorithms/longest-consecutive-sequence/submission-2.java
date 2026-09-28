class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int maxest=0;
        for(int num : nums)
        {
            set.add(num);
        }
        for(int num : nums)
        {
            int max = 0;
            if(!set.contains(num-1))
            {
                int left = num+1;
                max=max+1;
                while(set.contains(left))
                {
                    left++;
                    max++;
                }
            }
            maxest = Math.max(maxest, max);
        }
        return maxest;
    }
}
