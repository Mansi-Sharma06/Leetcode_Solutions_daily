class Solution {
    class DSU{
        int parent[];
        int rank[];

        public DSU(int n){
            parent = new int[n];
            rank = new int[n];

            for(int i = 0 ; i < n ; i++){
                parent[i] = i;
            }
        }

        public int find(int x){
            if(parent[x] == x){
                return x;
            }
            return find(parent[x]);
        }

        public boolean union(int x, int y){
            int xroot = find(x);
            int yroot = find(y);

            if(xroot == yroot){
                return false;
            }

            if(rank[xroot] < rank[yroot]){
                parent[xroot] = yroot;
            }
            else if(rank[xroot] > rank[yroot]){
                parent[yroot] = xroot;
            }
            else{
                 parent[yroot] = xroot;
                 rank[xroot] = rank[xroot] + 1;
            }
            return true;
        }
    }
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges,(a,b) -> Integer.compare(b[0],a[0]));

        DSU dsu_alice = new DSU(n+1);
        DSU dsu_bob = new DSU(n+1);

        int removed_edges = 0;
        int bob_edges = 0;
        int alice_edges = 0;

        for(int edge[] : edges){
            if(edge[0] == 3){
                if(dsu_alice.union(edge[1],edge[2])){
                    dsu_bob.union(edge[1],edge[2]);
                    alice_edges++;
                    bob_edges++;
                }
                else{
                    removed_edges++;
                }
            }
            else if(edge[0] == 2){
                if(dsu_bob.union(edge[1],edge[2])){
                    bob_edges++;
                }
                else{
                    removed_edges++;
                }
            }
            else{
                if(dsu_alice.union(edge[1],edge[2])){
                    alice_edges++;
                }
                else{
                    removed_edges++;
                }
            }
        }

        return (alice_edges == n-1 && bob_edges == n-1) ? removed_edges : -1;

    }
}