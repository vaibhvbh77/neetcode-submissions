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
//  The key thing

// Your original thought was:

// "When I visit a node, decrement the counter. When it reaches 0, that's my answer."

// 100% correct.

// The only issue was how to maintain that counter across recursive calls.

// For recursive tree problems, when you need a value like count to be updated and remembered across the entire traversal, a class variable is a simple solution.

// Also notice the order:

class Solution {
    int count;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        return solve(root);
        
    }
    public int solve(TreeNode root){
        if(root==null) return -1;

    int left = solve(root.left);

        if(left!=-1){
            return left;
        }
        count--;

        if(count==0){
            return root.val;
        }
        
   return solve(root.right);


    }
}
