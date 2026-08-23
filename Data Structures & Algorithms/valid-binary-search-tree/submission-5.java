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
    public boolean isValidBST(TreeNode root) {
        return solve(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean solve(TreeNode root,int left,int right){
        boolean curr=false;
        if(root==null) return true;
        if(left<root.val && right>root.val){
            curr=true;
            // bst for curr node;
        }

        boolean leftAns=solve(root.left,left,root.val);
        boolean rightAns=solve(root.right,root.val,right);

        if(leftAns && rightAns && curr){
            return true;
        }
        return false;

    }
}
