class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int num : nums){
            map.put(num , map.getOrDefault(num, 0) + 1);
            if(map.get(num) > 1){
                return true;
            }
        }
        return false;
    }
}