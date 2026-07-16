class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int res=0;
                if(grid[i][j]!=0){
                    res=dfs(grid,i,j);
                    max=Math.max(res,max);

                }
            }
        }
        return max;
    }
    public int dfs(int [][]grid,int row,int column){
        if(row<0||column<0||row>=grid.length||column>=grid[0].length||grid[row][column]==0){
            return 0;
        }
        grid[row][column]=0;
        return 1+dfs(grid,row+1,column)+dfs(grid,row-1,column)+
        dfs(grid,row,column+1)+dfs(grid,row,column-1);

    }
}
