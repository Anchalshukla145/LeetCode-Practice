class Solution {
    static int gcd(int a,int b){
     if(a==0){
        return b;
     }
     return gcd(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        for(int i=1;i<=(n*2);i++){
         if(i%2==0){
            even+=i;
         }
         else{
            odd+=i;
         }
        }
        return gcd(odd,even);
    }
}