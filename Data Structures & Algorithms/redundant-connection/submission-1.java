class Solution {
    int []parent;
    public int[] findRedundantConnection(int[][] edges) {
        parent=new int[edges.length+1];
        for(int i=1;i<parent.length;i++){
            parent[i]=i;
        }  


        for(int []edge:edges){
            int edge1=edge[0];
            int edge2=edge[1];

            int u=findParent(edge1);
            int v=findParent(edge2);
            if(u==v) return new int[]{ edge1,edge2};

            else {

                union(u,v);
            }
        }
        return new int[]{-1};
    }
        public int findParent(int x) {

        // x is the root
        if (parent[x] == x) {
            return x;
        }

        // Keep going up until we find the root
        return findParent(parent[x]);
    }

    public void union(int x, int y) {

        // Make y's root point to x's root
        parent[y] = x;
    }
}
