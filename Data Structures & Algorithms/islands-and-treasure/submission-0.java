class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]>q=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        // int count=1;
        while(q.isEmpty()==false){
            int[]temp=q.poll();
            int row=temp[0];
            int col=temp[1];
            //up
            if(row-1>=0&&grid[row-1][col]==Integer.MAX_VALUE){
                grid[row-1][col]=grid[row][col]+1;
                q.offer(new int[]{row-1,col});
            }
              //down
            if(row+1<grid.length&&grid[row+1][col]==Integer.MAX_VALUE){
                grid[row+1][col]=grid[row][col]+1;
                q.offer(new int[]{row+1,col});
            }
                //left
            if(col-1>=0&&grid[row][col-1]==Integer.MAX_VALUE){
                grid[row][col-1]=grid[row][col]+1;
                q.offer(new int[]{row,col-1});
            }
            // right
            if(col+1<grid[0].length&&grid[row][col+1]==Integer.MAX_VALUE){
                grid[row][col+1]=grid[row][col]+1;
                q.offer(new int[]{row,col+1});
            }



        
        }

    }
}
