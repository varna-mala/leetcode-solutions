class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefix=0,c=0;
        map.put(0,1);
        for(int i:nums)
        {
         prefix+=i;
         int prev=prefix-goal;
         if(map.containsKey(prev))
          {
            c+=map.get(prev);
          }
           map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        
        return c;
        
    }
}