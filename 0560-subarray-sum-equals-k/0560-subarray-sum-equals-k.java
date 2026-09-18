class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int currSum=0;
        Map<Integer,Integer> Prefixmap = new HashMap<>();
        Prefixmap.put(0,1);
        for(int num:nums){
            currSum+=num;
            if(Prefixmap.containsKey(currSum-k)){
                count+=Prefixmap.get(currSum-k);
            }
            Prefixmap.put(currSum,Prefixmap.getOrDefault(currSum,0)+1);
        }
       return count;
    }
}