
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            return solve(root, p, q);
    }
    public TreeNode solve(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)return null;
        if(root.val==p.val || root.val==q.val){
            return root;
        }

        TreeNode lca1=solve(root.left,p,q);
        TreeNode lca2=solve(root.right,p,q);
        
        if(lca1!=null && lca2!=null){
            return root;
        }
        if(lca1!=null) return lca1;
        else return lca2;
    }
}
