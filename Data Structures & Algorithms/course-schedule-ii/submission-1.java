class Solution {
    Stack<Integer>st;
    boolean []visited;
    boolean []pathVisited;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
           list.add(new ArrayList<>());
        }

        for(int []edge:prerequisites){
            int first=edge[0];
            int last=edge[1];
            list.get(last).add(first);
        }

        st=new Stack<Integer>();
        visited=new boolean[numCourses];
        pathVisited=new boolean[numCourses];
        
        int []res=new int[numCourses];
        for(int i=0;i<visited.length;i++)
        {
            if(!visited[i]){
                if(topo(list,i)){
                    return new int[]{};
                }
            }
        }
        int count=0;
        while(!st.isEmpty()){
             res[count++]=st.pop();
        }
        return res;
    }
    public boolean topo(List<List<Integer>>adj,int node){
        if(visited[node] &&pathVisited[node]){
            return true;
            //found cycle
        }
        if(visited[node]){
            return false;
        }
        visited[node]=true;
        pathVisited[node]=true;

        for(int neighbour:adj.get(node)){
            if(topo(adj,neighbour)){
                return true;
            }
        }
        pathVisited[node]=false;
        st.push(node);
        return false;
            
    }
}
