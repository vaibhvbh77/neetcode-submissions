
class Solution {
    public int goodNodes(TreeNode root) {
        return solve(root,Integer.MIN_VALUE);
    }
    public int solve(TreeNode root,int max){
        if(root==null) return 0;

        int count=0;

        if(root.val>=max){
            max=root.val;
            count++;
        }

        int left=solve(root.left, max);
        int right=solve(root.right, max);

        count=count+left+right;

        return count;




    }
}
