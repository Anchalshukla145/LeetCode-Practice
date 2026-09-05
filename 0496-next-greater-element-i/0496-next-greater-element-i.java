class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();
    
        for(int i=0;i<nums2.length;i++){
            int ele=nums2[i];
            int gt=-1;
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[j]>ele){
                    gt=nums2[j];
                    break;
                }
            }
            mp.put(ele,gt);
        }
        int [] ans= new int[nums1.length];
        int j=0;
        for(int i:nums1){
            if(mp.containsKey(i)){
                ans[j++]=mp.get(i);
            }
        }
        return ans;
    }
}