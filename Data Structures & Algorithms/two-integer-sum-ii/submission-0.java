class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0; i < numbers.length; i++) {
            int rem = target - numbers[i];
            if(map.containsKey(rem)) {
                res[0] = map.get(rem)+1;
                res[1] = i+1;
                return res;
            }
            map.put(numbers[i], i);
        }
        return res;
    }
}
