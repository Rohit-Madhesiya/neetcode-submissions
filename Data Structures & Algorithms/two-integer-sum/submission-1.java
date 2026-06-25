class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int num : nums){
            if(!map.containsKey(target-num)){
                map.put(num,i++);
            }else{
                return new int[]{map.get(target-num),i};
            }
        }
        return new int[]{0,0};
    }
}
