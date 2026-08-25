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

// NAIVE O(n^2)
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root==null) return true;

//         int heightLeft=height(root.left);
//         int heightRight=height(root.right);

//         if(Math.abs(heightLeft-heightRight)>1){
//             return false;
//         }

//         boolean leftSide=isBalanced(root.left);
//         boolean rightSide=isBalanced(root.right);

//         return leftSide && rightSide;
//     }
//     public int height(TreeNode root){
//         if(root==null) return 0;
        
//         int left=height(root.left);
//         int right=height(root.right);

//         return 1+Math.max(left,right);


//     }
// }


class Solution {
    public boolean isBalanced(TreeNode root) {
     
     int ans= solve(root);
     return ans==-1?false:true;


    }
    public int solve(TreeNode root){
        if(root==null) return 0;

        int left=solve(root.left);
        int right=solve(root.right);

        if(left==-1||right==-1) return -1;

        if(Math.abs(left-right)>1){
            return -1;
        }
        return 1+Math.max(left,right);

    }

}
