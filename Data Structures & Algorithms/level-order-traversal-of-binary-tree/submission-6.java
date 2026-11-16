

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>>res=new ArrayList<>();
         Queue<TreeNode> q = new ArrayDeque<>();
         if(root==null) return res;
         q.offer(root);
         while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                list.add(curr.val);
                if(curr.left!=null)
                q.offer(curr.left);

                if(curr.right!=null)
                q.offer(curr.right);
            }
            res.add(new ArrayList<>(list));
         }
         return res;
    }
}
