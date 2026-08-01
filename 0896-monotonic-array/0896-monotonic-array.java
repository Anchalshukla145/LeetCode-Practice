class Solution {
    public boolean isMonotonic(int[] arr) {
    boolean k=true;
    boolean l=true;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
           
         if(arr[i]<arr[i+1]){
            k=false;
         }
         
         if(arr[i]>arr[i+1]){
            l=false;
         }
         
        }
        
      
        return k||l;
    }
}