class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int total= 1;
        
        int [] any = new int[nums.length];

any[0] = 1;
        for(int i = 1; i< nums.length; i++)
        {
            any[i] = any[i - 1] * nums[i - 1];
        }

for(int i =nums.length - 1 ;i>= 0 ; i--)
        {
            any[i] = any[i] * total; 
            total = total * nums[i];
        }
        return any;
        
    }
}