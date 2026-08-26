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
    public boolean solve(TreeNode root,int lb,int ub){
        if(root==null) return true;
        if(root.val<=lb || root.val>=ub){
            return false;
        }
        //  current node is valid;

        boolean left=solve(root.left,lb,root.val);
        boolean right=solve(root.right,root.val,ub);


        return left &&right;


    }
}
