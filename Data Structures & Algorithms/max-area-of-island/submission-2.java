class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                count=0;
                if(grid[i][j]==1){
                dfs(grid,i,j);
                ans=Math.max(ans,count);
                }
            }
        }
        return ans;
        
    }

    public void dfs(int[][]grid,int row,int col){
        if(row>=grid.length||col>=grid[0].length||row<0||col<0||grid[row][col]==0)return;
        grid[row][col]=0;
        count++;


        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }
}
