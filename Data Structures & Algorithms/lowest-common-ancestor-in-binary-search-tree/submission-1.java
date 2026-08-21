
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {

        if(root==null)  return null;
  
        int curr=root.val;


        // goes to left if curr is small
        if(curr>p.val && curr>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }

        // goes to right if curr is large

        if(curr<p.val && curr<q.val){
        return         lowestCommonAncestor(root.right,p,q);
        }

        return root;

        


    }

}
