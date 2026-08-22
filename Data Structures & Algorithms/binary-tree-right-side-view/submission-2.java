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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q=new ArrayDeque<TreeNode>();
        ArrayList<Integer>level=new ArrayList<>();

        if(root!=null)
        q.add(root);
        while(q.isEmpty()==false){
            int size=q.size();
                for(int i=0;i<size-1;i++){
                    TreeNode curr=q.poll(); 

                    if(curr.left!=null)
                    q.offer(curr.left);

                    if(curr.right!=null)
                    q.offer(curr.right);
                }
                TreeNode lastElement=q.poll(); 
                level.add(lastElement.val);

                 if(lastElement.left!=null)
                    q.offer(lastElement.left);

                    if(lastElement.right!=null)
                    q.offer(lastElement.right);

        }

        return level;

        
    }
}
