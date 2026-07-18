class Solution {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
       return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
         if(i>max){
            max=i;
         }
         if(i<min){
            min=i;
         }
        }
        return gcd(min,max);
    }
}