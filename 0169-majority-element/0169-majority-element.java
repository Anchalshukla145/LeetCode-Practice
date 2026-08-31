class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(nums[0]==nums[n/2]){
            return nums[0];
        }
        return nums[n/2];
    }
}