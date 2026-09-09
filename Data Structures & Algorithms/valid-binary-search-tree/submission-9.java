
class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean valid(TreeNode root,int low,int high){
        if(root==null) return true;

        boolean current=false;
        if(root.val>low && root.val<high){
            current=true;
        }
        else return false;

        boolean left=valid(root.left,low,root.val);
        boolean right=valid(root.right,root.val,high);


        if(left && right) return true;

        return false;




    }
}
