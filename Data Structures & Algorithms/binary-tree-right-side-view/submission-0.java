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
    public int maxLevel=0;
    List<Integer>ans=new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        solve(root,1);
        return ans;
    }
    public void solve(TreeNode root,int level){
        if(root==null){return;}
        if(maxLevel<level){
            ans.add(root.val);
            maxLevel=level;
        }
        solve(root.right,level+1);
        solve(root.left,level+1);

    }
}
















