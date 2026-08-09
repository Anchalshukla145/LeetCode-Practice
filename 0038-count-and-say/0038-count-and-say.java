class Solution {
           
    
    public String countAndSay(int n) {
        if(n==1)return "1";
         String curr="1";
         for(int i=2;i<=n;i++){
            StringBuilder sb=new StringBuilder();
            int count=1;
            for(int j=0;j<curr.length();j++){
                if(j+1<curr.length() && curr.charAt(j) == curr.charAt(j + 1)){
                    count++;
                }
                else{
                    sb.append(count).append(curr.charAt(j));
                    count = 1;
                }
            }
            curr = sb.toString();
         }
         return curr;
    }
}