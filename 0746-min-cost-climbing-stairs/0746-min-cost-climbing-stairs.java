class Solution {
    
     int memo[];

    static int helper(int i,int [] cost,int [] memo){
     
        if(i>=cost.length)return 0;
        if(memo[i]!=-1){
            return memo[i];
        }
        memo[i]=cost[i]+Math.min(helper(i+1,cost,memo),helper(i+2,cost,memo));
        return memo[i];

    }
    public int minCostClimbingStairs(int[] cost) {
          memo = new int[cost.length];
            Arrays.fill(memo,-1);
        return Math.min(helper(0,cost,memo),helper(1,cost,memo));
    }
}