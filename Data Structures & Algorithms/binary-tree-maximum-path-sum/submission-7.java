
class Solution {
    int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        solve(root);

        return max;

    }
    public int solve(TreeNode root)
    {
        if(root==null) return Integer.MIN_VALUE;

        
        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));
        
        int current=left+right+root.val;

        max=Math.max(max,current);

        return root.val+Math.max(left,right);



    }
}
