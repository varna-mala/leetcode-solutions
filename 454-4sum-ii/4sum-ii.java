class Solution {
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int x : a)
            for (int y : b)
                map.put(x + y, map.getOrDefault(x + y, 0) + 1);

        int count = 0;

        for (int x : c)
            for (int y : d)
                count += map.getOrDefault(-(x + y), 0);

        return count;
    }
}