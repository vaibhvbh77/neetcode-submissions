
class Solution {
    public int goodNodes(TreeNode root) {
       return solve(root,Integer.MIN_VALUE);
        
    }
    public int solve(TreeNode root,int max){
        if(root==null)return 0;
        int curr=root.val;
        if(curr>=max){
        max=curr;
            return 1+solve(root.left,max)+solve(root.right,max);
        }
        else{
            return solve(root.left,max)+solve(root.right,max);
        }

    }
}
