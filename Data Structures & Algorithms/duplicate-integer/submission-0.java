class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(Integer num : nums)
            set.add(num);
        
        return nums.length != set.size();
    }
}