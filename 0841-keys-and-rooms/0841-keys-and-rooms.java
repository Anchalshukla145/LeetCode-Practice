class Solution {
    static void bfs(int source,List<List<Integer>> adj,boolean [] isVis){
Queue<Integer> q=new LinkedList<>();
q.offer(source);
isVis[source]=true;
while(!q.isEmpty()){
    int node = q.poll();
    for(int nei:adj.get(node)){
        if(!isVis[nei]){
            q.offer(nei);
            isVis[nei]=true;
        }
    }
} 
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean []isVisited=new boolean[n];
        bfs(0,rooms,isVisited);
        for(boolean b:isVisited){
            if(!b){
                return false;
            }
        }
        return true;
    }
}