class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null &&q==null) return true;
        if(p==null || q==null) return false;

        if(p.val!=q.val) return false;


        //  p.val=q.val

        boolean left=isSameTree(p.left,q.left);
        boolean right=isSameTree(p.right,q.right);



        if(left&&right) return true;

        return false;

        
    }
}
