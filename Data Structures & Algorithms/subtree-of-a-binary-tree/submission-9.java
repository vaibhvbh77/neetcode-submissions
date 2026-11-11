

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) return true;
        if((root==null && subRoot!=null)) return false;

        boolean current=isSameTree(root,subRoot);
        boolean left=isSubtree(root.left,subRoot);
        boolean right=isSubtree(root.right,subRoot);

        return current||left||right;

    }
        public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if((p==null && q!=null)|| (p!=null && q==null)) return false;

        boolean current=false;
        if(p.val==q.val){
            current=true;
        }

        boolean left=isSameTree(p.left,q.left);
        boolean right=isSameTree(p.right,q.right);

        return (left&&right&&current);

    }
}
