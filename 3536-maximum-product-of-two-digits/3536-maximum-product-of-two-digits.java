class Solution {
    public int maxProduct(int n) {
          int p=1;
        ArrayList<Integer> arr= new ArrayList<>();

       while(n>0){
        int dig = n%10;
          arr.add(dig);
        n/=10;
       }
       Collections.sort(arr);
       return arr.get(arr.size()-2)*arr.get(arr.size()-1);
    }
}