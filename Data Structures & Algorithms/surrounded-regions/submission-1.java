    class Solution {
    boolean []visited;
        public void solve(char[][] board) {
            int row=board.length;
            int col=board[0].length;
    for (int i = 0; i < board[0].length; i++) {

        dfs(board, 0, i);

    }

    // Right column

    for (int i = 0; i < board.length; i++) {

        dfs(board, i, board[0].length - 1);

    }

    // Bottom row

    for (int i = 0; i < board[0].length; i++) {

        dfs(board, board.length - 1, i);

    }

    // Left column

    for (int i = 0; i < board.length; i++) {

        dfs(board, i, 0);

    }
            

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(board[i][j]=='O'){
                        board[i][j]='X';
                    }
                }
            }

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(board[i][j]=='T'){
                        board[i][j]='O';
                    }
                }
            }
        }
        public void dfs(char[][]board,int currentRow,int currentColumn){
            int row=board.length;
            int col=board[0].length;
            if(currentColumn<0 ||currentColumn>=col||currentRow<0||currentRow>=row||board[currentRow][currentColumn]=='X'||board[currentRow][currentColumn]=='T'){
                return;
            }
            board[currentRow][currentColumn]='T';
            dfs(board,currentRow+1,currentColumn);
            dfs(board,currentRow-1,currentColumn);
            dfs(board,currentRow,currentColumn+1);
            dfs(board,currentRow,currentColumn-1);
            
        
        }
    }
