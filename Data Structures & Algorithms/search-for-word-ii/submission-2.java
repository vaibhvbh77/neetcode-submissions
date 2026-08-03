class Solution {
    List<String>ans=new ArrayList<String>();
    public class Node{
        boolean isEnd;
        String word;
        Node []children=new Node[26];
    }
    public List<String> findWords(char[][] board, String[] words) {
        Node root=new Node();
        for(String res:words){
            Node curr=root;
            for(int i=0;i<res.length();i++){
                int index=res.charAt(i)-'a';
                if(curr.children[index]==null){
                    curr.children[index]=new Node();
                }
                curr=curr.children[index];
            }

             curr.isEnd = true;
            curr.word = res;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                  dfs(board, i, j, root);
            }
        }

return ans;
    }

    public void dfs(char[][]board,int row,int col,Node curr){
        if(row<0||col<0||row>=board.length||col>=board[0].length||board[row][col]=='#') return;
        int index=board[row][col]-'a';
        if(curr.children[index]==null) return;
        Node next=curr.children[index];
        if(next.isEnd) {
            ans.add(next.word);
            next.isEnd=false;
        }
         char ch = board[row][col];
        board[row][col]='#';
        dfs(board, row + 1, col, next);
        dfs(board, row - 1, col, next);
        dfs(board, row, col + 1, next);
        dfs(board, row, col - 1, next);

         board[row][col] = ch;


    }
}
