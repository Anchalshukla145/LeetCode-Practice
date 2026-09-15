class Solution {
    static void bfs(int source,List<List<Integer>> adj,boolean []isVis){
        Queue<Integer> q= new LinkedList<>();
        q.offer(source);
        isVis[source]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int nei:adj.get(node)){
             if(!isVis[nei]){
                isVis[nei]=true;
                q.offer(nei);
             }
            }
        }
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] IsVis= new boolean[n];
        bfs(source,adj,IsVis);
        return IsVis[destination];

    }
}