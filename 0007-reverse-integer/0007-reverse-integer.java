class Solution {
    int reverse1(int num){
        int rev=0;
     while(num>0){
    int dig=num%10;
    if(rev > Integer.MAX_VALUE / 10 || 
              (rev == Integer.MAX_VALUE / 10 && dig > 7)){
                return 0;
            }

            // underflow check
            if(rev < Integer.MIN_VALUE / 10 || 
              (rev == Integer.MIN_VALUE / 10 && dig < -8)){
                return 0;
            }
    rev=rev*10+dig;
    num/=10;
     }
     return rev;
    }
    public int reverse(int x) {
        if(x>0){
         return reverse1(x);
        }
        else{
           int signed=-1;
           x=Math.abs(x);
           return signed*reverse1(x);
        }
    }
}