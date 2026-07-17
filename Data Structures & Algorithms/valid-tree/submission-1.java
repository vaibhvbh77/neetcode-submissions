class Solution {
    boolean visited[];
    public boolean validTree(int n, int[][] edges) {
        visited=new boolean[n];
     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

for (int i = 0; i < n; i++) {
    adj.add(new ArrayList<>());
}

for (int[] edge : edges) {
    adj.get(edge[0]).add(edge[1]);
    adj.get(edge[1]).add(edge[0]);
}


       boolean ans= dfs(0,-1,adj);
       for (int i = 0; i < n; i++) {
    if (!visited[i]) {
        return false;
    }
}
return ans;
 
        
    }


    public boolean dfs(int current,int parent,ArrayList<ArrayList<Integer>>adj){

     visited[current]=true;
     for(int temp:adj.get(current)){
        if(visited[temp]==false)
            {
                if(!dfs(temp,current,adj)){
                    return false;
                }
            }

        else if(parent!=temp){
            return false;
        }
     }
     return true;
        
    }
}
