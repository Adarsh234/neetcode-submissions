class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.get(n)!=null){
                return true;
            }
            map.put(n, n);
        }
        return false;
    }
}