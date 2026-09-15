class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefix = 0;
        int count = 0;

        map.put(0, 1);

        for (int num : nums) {

            if (num % 2 == 1) {
                prefix++;
            }

            int need = prefix - k;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}