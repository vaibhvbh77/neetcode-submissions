class Solution {
    int [][]memo;
    public int uniquePaths(int m, int n) {
        boolean [][]grid=new boolean[m][n]; 
        memo=new int[m][n]; 
        for(int []rows:memo){
            Arrays.fill(rows,-1);
        }

        return dfs(grid,0,0);

    }
    public int dfs(boolean [][] grid,int row,int col){

        if(row<0||col<0|| row>=grid.length||col>=grid[0].length||grid[row][col]==true){
            return 0;
        }
        if(grid.length-1== row && grid[0].length-1==col ){
            return 1;
        }

        grid[row][col]=true;

        if(memo[row][col]!=-1)
        return memo[row][col];

        int right=dfs(grid,row,col+1);
        int down=dfs(grid,row+1,col);

        grid[row][col] = false;

        memo[row][col]=right+down;

        return right+down;
    }
}
