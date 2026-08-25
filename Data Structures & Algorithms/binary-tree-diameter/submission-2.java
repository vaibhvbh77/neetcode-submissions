
class Solution {
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=Integer.MIN_VALUE;
         height(root);
         return max;
    }
    public int height(TreeNode root){
        if(root==null)
        return 0;

        int left=height(root.left);
        int right=height(root.right);

        max=Math.max(max,left+right);

        return Math.max(left,right)+1;
        
    }
}
