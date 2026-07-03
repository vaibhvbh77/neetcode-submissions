

class Solution {
    public boolean isBalanced(TreeNode root) {
        return solve(root)==-1?false:true;
    }

        public int solve(TreeNode root) {
        if(root==null)return 0;
        int lh=solve(root.left);
        int rh=solve(root.right);
        if(lh==-1 || rh==-1)return -1;
        if(Math.abs(lh-rh)>1)
        return -1;
        return Math.max(lh,rh)+1;
    }
}
