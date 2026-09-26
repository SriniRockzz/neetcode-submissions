class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int total= 1;
        int a = 0;
        for(int num : nums)
        {
            if(num == 0)
            {
                a++;
                continue;
            }
            total = num * total;
        }
int [] any = new int[nums.length];
if(a > 1) return any;

for(int i =0;i< nums.length ; i++)
        {

            if(nums[i] == 0)
            {
                any[i] = total;
                continue;
            }
            if(a > 0)
            {
                any[i] = 0;
            }
            else
            {
            any[i] =  total/nums[i];
            }
        }
        return any;
        
    }
}