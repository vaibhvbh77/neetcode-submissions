
class Solution {
    public int goodNodes(TreeNode root) {
        return solve(root,Integer.MIN_VALUE);
    }
    public int solve(TreeNode root,int max){
        if(root==null) return 0;


        int current=0;

        if(root.val>=max)
        current=1;


        max=Math.max(root.val,max);

        int left=solve(root.left,max);
        int right=solve(root.right,max);

        return left+right+current;


    }
}
