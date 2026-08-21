class Solution {
    static int [] merge(int[] arr1, int[] arr2){
      int n=arr1.length,m=arr2.length;
      int l=n+m;
      int [] arr3=new int [l];
      int i=0,j=0,k=0;
      while(i<n && j<m){
        if(arr1[i]<=arr2[j]){
            arr3[k++]=arr1[i++];
        }
        else{
          arr3[k++]=arr2[j++];
        }
      }
      while(i<n){
        arr3[k++]=arr1[i++];
      }
      while(j<m){
        arr3[k++]=arr2[j++];
      }
      return arr3;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums =merge(nums1,nums2);
        Arrays.sort(nums);
        int l=nums.length;
        if(l%2==1){
            return (double)nums[l/2];
        }
        else{
            return ((nums[l/2]+nums[(l/2)-1])/2.0);
        }
    }
}