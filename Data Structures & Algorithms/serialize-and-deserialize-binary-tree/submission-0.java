

public class Codec {

    // Encodes a tree to a single string.
    public String ans="";
    public String serialize(TreeNode root) {
        if(root==null) {
            ans=ans+"#,";
            return ans;
        }
        ans=ans+root.val+",";
        serialize(root.left);
        serialize(root.right);

        return ans;

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return solve(data);
    }
    int index=0;
    public TreeNode solve(String data){
        if(index==data.length()){
            return null;
        }
        String temp="";
        while(data.length()>index && data.charAt(index)!=','){
            temp+=data.charAt(index);
            index++;
        }
        index++;
        if(temp.charAt(0)=='#') return null;
        TreeNode root=new TreeNode(Integer.parseInt(temp));
        root.left=solve(data);
        root.right=solve(data);

        return root;

    }
}
