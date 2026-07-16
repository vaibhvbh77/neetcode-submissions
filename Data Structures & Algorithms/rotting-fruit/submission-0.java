class Solution {
    public int orangesRotting(int[][] grid) {
        int ans=0;
        int fresh=0;

        Queue<int[]>q=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                   if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0)
    return 0;
        while(q.isEmpty()==false){
            int size=q.size();
            //rottten travel
            for(int i=0;i<size;i++){
                int []curr=q.poll();
                int row = curr[0];
                int col = curr[1];
                // down
                if(row+1<grid.length &&grid[row+1][col]==1){
                    fresh--;
                    grid[row+1][col]=2;
                    q.add(new int[]{row+1,col});
                }

                    // up
                if(row-1>=0 &&grid[row-1][col]==1){
                    fresh--;
                    grid[row-1][col]=2;
                    q.add(new int[]{row-1,col});
                }

                    // right
                if(col+1<grid[0].length &&grid[row][col+1]==1){
                    fresh--;
                    grid[row][col+1]=2;
                    q.add(new int[]{row,col+1});
                }

                if (col - 1 >= 0 && grid[row][col - 1] == 1) {

    grid[row][col - 1] = 2;
    fresh--;
    q.offer(new int[]{row, col - 1});

}

                // add the neighbours of current node  and 
            }
            if(q.isEmpty()==false) ans++;
        }

if (fresh == 0)
    return ans;

return -1;
    }
}
