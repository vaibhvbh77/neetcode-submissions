class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>queue=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int minutes=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int []curr=queue.poll();
                int row=curr[0];
                int col=curr[1];

                // putting all the 4 neighoburs
                //  up direction 
                if(row-1>=0 && grid[row-1][col]==1){
                    grid[row-1][col]=2;
                    queue.offer(new int[]{row-1,col});
                }

                //  down direction 
                if(row+1<grid.length && grid[row+1][col]==1){
                    grid[row+1][col]=2;
                    queue.offer(new int[]{row+1,col});
                }

//                  left 
                if(col-1>=0 && grid[row][col-1]==1){
                    grid[row][col-1]=2;
                    queue.offer(new int[]{row,col-1});
                }

                //  rigt direction 
                if(col+1<grid[0].length && grid[row][col+1]==1){
                    grid[row][col+1]=2;
                    queue.offer(new int[]{row,col+1});
                }
            }
            if(!queue.isEmpty()){
                    minutes++;
                }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }


        return minutes;

    }
}
