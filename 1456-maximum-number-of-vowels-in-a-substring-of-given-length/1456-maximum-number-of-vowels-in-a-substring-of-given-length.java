class Solution {static boolean isVowel(char ch){
       return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int maxCount=0;
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
             maxCount++;
            }
        }
        if(k==maxCount)return k;
        int count=maxCount;
        int n=s.length();
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
           maxCount=Math.max(count,maxCount);
           if(maxCount==k)return k;
        }
    
        return maxCount;
    }
}