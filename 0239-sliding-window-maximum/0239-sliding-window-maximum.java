class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n= arr.length;
        if (n == 0 || k <= 0) return new int[0];
        int l=0;
        int [] ans = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
        while(!dq.isEmpty() && dq.peekFirst()<=i-k){
            dq.removeFirst();
        }
        while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
            dq.removeLast();
        }
        dq.addLast(i);
        if(i>=k-1){
            ans[l++]=arr[dq.peekFirst()];
            
        }
        }
        return ans;
    }
}