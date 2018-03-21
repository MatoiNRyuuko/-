package killLint;

import killoffer.TreeNode;

public class ConvertBST {
	private int rootvalsum = 0;
    public TreeNode convertBST(TreeNode root) {
        // write your code here
        if(root == null){
            return null;
        }
        convertBST(root.right);
        rootvalsum += root.val;
        root.val = rootvalsum;
        
        convertBST(root.left);
        
        
    
        return root;
    }
}
