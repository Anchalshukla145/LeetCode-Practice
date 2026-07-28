class Solution {
    boolean isPalindrome(String s){
        if(s.length()==1)return true;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {

        int n=s.length();
        if(n<2)return s;
        String ans="";
        int max=0;
        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
               String r=s.substring(i,j+1);
               if(isPalindrome(r)){
               int len=r.length();
                if(len>max){
                    max=len;
                    ans=r;
                }
               }
            }
        }
        return ans;
    }
}