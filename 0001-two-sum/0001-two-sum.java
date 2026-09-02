class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int [] arr = {-1,-1};
        for(int i=0;i<nums.length;i++){
            int need = target-nums[i];
            if(map.containsKey(need)){
                arr[0]=map.get(need);
                arr[1]=i;
            }
            map.put(nums[i],i);
        }  
        return arr;
    }
}