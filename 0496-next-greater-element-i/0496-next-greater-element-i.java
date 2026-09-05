class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            int ele=nums1[i];
            int count=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==ele){
                    for(int k=j+1;k<nums2.length;k++){
                if(ele<nums2[k]){
                    count=nums2[k];
                    break;
                }
            }
            break;
            }
            }
            
                mp.put(ele,count);
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