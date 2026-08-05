class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean [][]grid=new boolean [n][n];
        solve(grid,0);
        return res;
    }
    public boolean isSafe(boolean[][]grid,int row,int col)
    {
        int n=grid.length;
        // down and up
        for(int i=0;i<row;i++){
            if(grid[i][col]==true){
                return false;
            }
        }


        // upper left diagonal
        for(int r=row-1,c=col-1;r>=0&&c>=0;r--,c--){
             if(grid[r][c]==true){
                return false;
            }
        }

         // upper right diagonal
        for(int r=row-1,c=col+1;r>=0&&c<n;r--,c++){
             if(grid[r][c]==true){
                return false;
            }
        }

        return true;

    }

    public void solve(boolean [][]grid,int row)
    {
        int n=grid.length;
        if(row==n){
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String firstAns="";
            for(int j=0;j<n;j++){
                if(grid[i][j]==true){
                    firstAns=firstAns+"Q";
                }
                else{
                    firstAns=firstAns+".";
                }

            }
        list.add(firstAns);
        }
        res.add(list);
        return;
        }

       for(int col=0;col<n;col++){
        if(isSafe(grid, row, col)){
            grid[row][col]=true;
            solve(grid,row+1);
            grid[row][col]=false;
        }
       }
    }
}
