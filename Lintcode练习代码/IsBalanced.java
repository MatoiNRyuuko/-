package killLint;

import killoffer.TreeNode;

public class IsBalanced {
	 public boolean isBalanced(TreeNode root) {
	        // write your code here
	        if(root == null){
	            return true;
	        }
	        
	        int left = getHeight(root.left);
	        int right = getHeight(root.right);
	        if(Math.abs(left - right) > 1)
	        {
	            return false;
	        }
	        return isBalanced(root.left) && isBalanced(root.right);
	    }
	    public int getHeight(TreeNode root){
	        if(root == null){
	            return 0;
	        }
	        int left = getHeight(root.left);
	        int right = getHeight(root.right);
	        
	        return 1+(left>right ? left : right);
	    }
}
