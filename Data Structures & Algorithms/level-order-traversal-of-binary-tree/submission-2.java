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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new ArrayDeque<TreeNode>();
        List<List<Integer>> list=new ArrayList<>();
        if(root!=null)
        q.add(root);
        while(q.isEmpty()==false){
            ArrayList<Integer>level=new ArrayList<>();
            int size=q.size();
                for(int i=0;i<size;i++){
                    TreeNode curr=q.poll();
                    level.add(curr.val);


                    if(curr.left!=null)
                    q.offer(curr.left);

                    if(curr.right!=null)
                    q.offer(curr.right);
                }
                list.add(level);

        }
        return list;

        
    }
}
