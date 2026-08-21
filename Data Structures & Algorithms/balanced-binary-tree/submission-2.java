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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        int heightLeft=height(root.left);
        int heightRight=height(root.right);
        if(Math.abs(heightLeft-heightRight)>1){
            return false;
        }

        boolean leftSide=isBalanced(root.left);
        boolean rightSide=isBalanced(root.right);

        return leftSide && rightSide;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        
        int left=height(root.left);
        int right=height(root.right);

        return 1+Math.max(left,right);


    }
}
