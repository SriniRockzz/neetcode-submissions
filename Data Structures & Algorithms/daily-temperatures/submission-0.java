class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stck = new Stack<>();
        
        for (int i= temperatures.length-1; i>= 0;i--)
        {
            stck.push(temperatures[i]);
        }
        int j =0;
        int [] result = new int[temperatures.length];
        

        while(stck.size()>0)
        {
        int k=1;
        int l = stck.pop();
        for(int i =j+1;  i< temperatures.length; i++)
        {
            if(l< temperatures[i])
            {
               result[j] = k;
               break;
            }
            k++;
        }  
        j++;

             
        }

        return result;
    }
}
