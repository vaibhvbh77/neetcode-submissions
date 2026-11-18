

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return solve(root,p,q);

    }
    public TreeNode solve(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return null;

        TreeNode left=solve(root.left,p,q);
        TreeNode right=solve(root.right,p,q);

        if(left!=null && right!=null) return root;
        
        if(root==p || root==q) return root;

        if(left==null) return right;

        else return left;



    }
}
