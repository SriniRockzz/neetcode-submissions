class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int num : nums)
        {
        
            if(map.containsKey(num))
            {
               int  i = map.get(num);
                i++;
                map.put(num, i);
                continue;
            }
            map.put(num, 1);
        } 

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> (map.get(a) - map.get(b))
        );

        for (int num : map.keySet())
        {
            pq.add(num);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }

int[] result = new int[k];
        for(int j =0; j<k;j++)
        {
           result[j]= pq.poll();
        }

        return result;


}
}
