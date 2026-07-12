class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int[] temp = arr.clone();
        Arrays.sort(temp);
        Map<Integer,Integer> mp = new HashMap<>();
        int r=1;
        for(int i: temp){
            if(!mp.containsKey(i)){
                mp.put(i,r);
                r++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}