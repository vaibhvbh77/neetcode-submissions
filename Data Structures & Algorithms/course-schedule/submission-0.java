class Solution {
        boolean []visited;
    boolean []pathVisited;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V=numCourses;
        int [][]edges=prerequisites;
              List<List<Integer>>list=new ArrayList<>();
        visited=new boolean[V];
        pathVisited=new boolean[V];
        
        for(int i=0;i<V;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int []edge:edges){
            list.get(edge[1]).add(edge[0]);
        }
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
               if(dfs(list,i)){
                   return false;
               }
            }
        }
        
        return true;
    }
        public boolean dfs(List<List<Integer>>list,int node){
        if(visited[node] && pathVisited[node]){
            return true;
        }
        
         if(visited[node]){
            return false;
        }
        
        visited[node] = true;
        pathVisited[node] = true;
        
        
        for(int neighbours:list.get(node)){
            if(dfs(list,neighbours)){
                return true;
            }
        }
            pathVisited[node] = false;
            
        return false;
    }
}
