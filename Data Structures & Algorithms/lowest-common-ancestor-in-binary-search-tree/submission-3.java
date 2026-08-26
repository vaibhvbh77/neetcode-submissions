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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return solve(root,p,q);
    }
    public TreeNode solve(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return null;

        int current=root.val;

        if(current>p.val &&current>q.val)
        {
            return solve(root.left,p,q);
        }
         if(current<p.val && current<q.val){
            return solve(root.right,p,q);
        }
        return root;
    }
}
