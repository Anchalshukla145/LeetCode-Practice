class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int maxLen=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
           while(nums[r]-nums[l]>1){
            l++;
           }
           if(nums[r]-nums[l]==1){
            maxLen=Math.max(maxLen,r-l+1);
           }
        }
        return maxLen;
    }
}