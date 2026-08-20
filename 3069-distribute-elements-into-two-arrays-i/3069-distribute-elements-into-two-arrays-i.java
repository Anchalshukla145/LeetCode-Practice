class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2 =  new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int j=0;
        int k=0;
        for(int i=2;i<n;i++){
            if(arr1.get(j)>arr2.get(k)){
                arr1.add(nums[i]);
                j++;
            }
            else{
                arr2.add(nums[i]);
                k++;
            }
        }
        int[] result = new int[n];
        int idx = 0;
        for (int val : arr1) {
            result[idx++] = val;
        }
        for (int val : arr2) {
            result[idx++] = val;
        }
        
        return result;
    }
}