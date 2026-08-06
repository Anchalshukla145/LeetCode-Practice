class Solution {
    static int product(int n){
        int p=1;
        while(n>0){
             if(n%10==0)return 0;
            p*=n%10;
            n/=10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {

        for(int i=n;i<=n+10;i++){
          if(product(i)%t==0){
            return i;
          }
        }
        return -1;
    }
}