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
    int count;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        return solve(root);
    }

    public int solve(TreeNode root){
        if(root==null) return -1;

        int left=solve(root.left);
        if(left!=-1) return left;
        // left
        // current
        count--;
        if(count==0) return root.val;
        // right

        int right=solve(root.right);
        if(right!=-1) return right;

        return -1;
    }
}
