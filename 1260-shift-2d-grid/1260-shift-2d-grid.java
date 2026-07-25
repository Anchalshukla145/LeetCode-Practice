class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        int total = m * n;
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            res.add(row);
        }
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
                int old1D = i * n + j;
                int new1D = (old1D + k) % total;
                
                int newRow = new1D / n;
                int newCol = new1D % n;
                
                
                res.get(newRow).set(newCol, grid[i][j]);
            }
        }
        return res;
    }
}