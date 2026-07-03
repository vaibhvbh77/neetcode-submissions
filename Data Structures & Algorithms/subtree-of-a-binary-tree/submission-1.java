/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        if(solve(root,subRoot))return true;
        if(root==null)return false;

        boolean lh=false;boolean rh=false;
        if(root.left!=null)
         lh= isSubtree(root.left,subRoot);

        if(root.right!=null)
         rh=isSubtree(root.right,subRoot);

        return lh ||rh;
        

    }
        public boolean solve(TreeNode p, TreeNode q){
        if(p==null && q==null )return true;
        if(p==null && q!=null || p!=null &&q==null)return false;
        if(p.val==q.val){
            return solve(p.left,q.left)&&solve(p.right,q.right);
        }
        return false;
    }
}
