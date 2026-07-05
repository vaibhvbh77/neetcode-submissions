class Solution {
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode solve(int[] preorder, int[] inorder,int si,int ei){
        if(si>ei)return null;

         TreeNode root=new TreeNode(preorder[preIndex++]);
         int inIndex=0;
         for(int i=si;i<=ei;i++){
            if(inorder[i]==root.val){
                inIndex=i;
                break;
            }
         }
         root.left=solve(preorder,inorder,si,inIndex-1);
         root.right=solve(preorder,inorder,inIndex+1,ei);

         return root;
    }
}
