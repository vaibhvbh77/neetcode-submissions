
class Solution {
int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return sum;
    }
    public int solve(TreeNode root){
        if(root==null) return 0;

        int left=solve(root.left);
        int right=solve(root.right);

         sum = Math.max(
            sum,
            root.val + Math.max(0, left) + Math.max(0, right)
        );
          return root.val + Math.max(0, Math.max(left, right));

    }
}
