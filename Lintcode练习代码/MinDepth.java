package killLint;

import killoffer.TreeNode;

public class MinDepth {
	public int minDepth(TreeNode root) {
        // write your code here
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0){
            return right +1;
        }
        if(right == 0){
            return left+1;
        }
        return 1+(left<right ? left : right) ;
    }
}
