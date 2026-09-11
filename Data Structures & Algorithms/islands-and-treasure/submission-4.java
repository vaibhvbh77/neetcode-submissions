class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]>q=new ArrayDeque<>();
        // Added to the queue
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }

        // poolling
        while(q.isEmpty()==false){
            int []curr=q.poll();
            int row=curr[0];
            int col=curr[1];

            // up 
            if(row-1>=0 && grid[row-1][col]==Integer.MAX_VALUE){
                q.offer(new int[]{row-1,col});
                grid[row-1][col]=1+grid[row][col];
            }

             // down 
            if(row+1<grid.length && grid[row+1][col]==Integer.MAX_VALUE){
                q.offer(new int[]{row+1,col});
                grid[row+1][col]=1+grid[row][col];
            }

            // left 
            if(col-1>=0 && grid[row][col-1]==Integer.MAX_VALUE){
                q.offer(new int[]{row,col-1});
                grid[row][col-1]=1+grid[row][col];
            }

             // right 
            if(col+1<grid[0].length && grid[row][col+1]==Integer.MAX_VALUE){
                q.offer(new int[]{row,col+1});
                grid[row][col+1]=1+grid[row][col];
            }

        }
        
    }
}
