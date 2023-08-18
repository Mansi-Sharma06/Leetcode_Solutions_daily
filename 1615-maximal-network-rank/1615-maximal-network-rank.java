class Solution {  
    int[] deg;
    int[][] adj;

    public int maximalNetworkRank(int n, int[][] roads) {
        if (roads.length <= 1) return roads.length; 
        deg = new int[n];
        adj = new int[n][n];
        for (int i = 0; i < roads.length; i++) {         
            deg[roads[i][0]]++;
            deg[roads[i][1]]++;
            adj[roads[i][0]][roads[i][1]] = 1;
            adj[roads[i][1]][roads[i][0]] = 1;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
    
        for (int i = 0; i < n; i++) {
            for (int j = i + 1;j < n; j++) {
                sum = deg[i] + deg[j];
                if (adj[i][j] == 1) {
                    sum--;
                }

                if (sum == roads.length) {
                    return sum;
                }

                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}