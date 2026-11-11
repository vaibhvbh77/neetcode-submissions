

class Solution {
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
