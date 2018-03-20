package killLint;

import killoffer.TreeNode;

public class IsIdentical {
	public boolean isIdentical(TreeNode a, TreeNode b) {
        // write your code here
        
        if(a==null&&b==null){
            return true;
        }
        if(a==null||b==null){
            return false;
        }
        if(a.val!=b.val){
            return false;
        }
        
        
        
        return isIdentical(a.left,b.left)&&isIdentical(a.right,b.right);
    }
}
