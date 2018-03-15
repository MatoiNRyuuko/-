package killLint;

import killoffer.TreeNode;

public class MaxNode {
	private TreeNode MaxNode = new TreeNode(-1000);
    public TreeNode maxNode(TreeNode root) {
        
        if(root == null){
            return null;
        }
        
        if(MaxNode.val < root.val){
            MaxNode.val = root.val;
        }
        maxNode(root.left);
        maxNode(root.right);
        return MaxNode;
    }
}
