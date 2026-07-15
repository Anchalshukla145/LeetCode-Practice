class Solution {
    static int gcd(int a,int b){
     if(a==0){
        return b;
     }
     return gcd(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        int even=n*(n+1);
        int odd=n*n;
        
        return gcd(odd,even);
    }
}