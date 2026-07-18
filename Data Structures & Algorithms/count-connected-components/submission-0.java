class Solution {
    boolean []visited;
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<Integer>());
        }
        visited=new boolean[n];
        int res=0;

        // /creating the graph
        for(int []edge:edges){
            int first=edge[0];
            int second=edge[1];
            list.get(first).add(second);
            list.get(second).add(first);
        }
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                //dfs
                dfs(list,i);
                res++;
            }
        }
        return res;

    }
    public void dfs(List<List<Integer>>list,int node){

        visited[node]=true;
        for(int neighbours:list.get(node)){
            if(!visited[neighbours]){
                dfs(list,neighbours);
            }
        }
        return;
    }
}
