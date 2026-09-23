class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;

    }
    public boolean dfs(char[][]board,String word,int row,int col,int index){
        if(index==word.length()) return true;
        if(row<0 || col<0 || row>=board.length ||col>=board[0].length||board[row][col]=='#' || board[row][col]!=word.charAt(index))
        return false;

        char temp=word.charAt(index);
        board[row][col]='#';
        boolean left=dfs(board,word,row,col-1,index+1);
        boolean right=dfs(board,word,row,col+1,index+1);
        boolean top=dfs(board,word,row-1,col,index+1);
        boolean bottom=dfs(board,word,row+1,col,index+1);

        board[row][col]=temp;

        if(left||right||top||bottom) return true;

        return false;

    }
}
