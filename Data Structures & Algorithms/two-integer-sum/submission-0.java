class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int num : nums){
            int need = target - num;
            if(map.containsKey(need)){
                return new int[] {map.get(need), index};
            }
            map.put(num, index);
            index++;
        }
        return new int[0];
    }
}
