class WordDictionary {
    TrieNode root;

    public class TrieNode{
        TrieNode[]children=new TrieNode[26];
        boolean isEnd;
    }

    public WordDictionary() {
             root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new TrieNode(); 
            }
            curr=curr.children[index];
        }
        curr.isEnd=true;

    }

    public boolean search(String word) {
        return searchFrom(word, 0, root);
    }
    public boolean searchFrom(String word,int position,TrieNode curr){
          if (position == word.length()) {
                return curr.isEnd;
            }
         if(word.charAt(position)=='.'){
            for(int i=0;i<26;i++){
                if(curr.children[i]!=null){
                   boolean temp= searchFrom(word,position+1,curr.children[i]);
                   if(temp) return true;
                }
            }
            return false;
         }
         else{
            int index=word.charAt(position)-'a';
            if(curr.children[index]!=null){
              boolean temp=  searchFrom(word,position+1,curr.children[index]);
              return temp;
            }
            else{
                return false;
            }

         }   

    }
}
