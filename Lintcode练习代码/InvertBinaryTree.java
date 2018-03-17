package killLint;

import java.util.LinkedList;
import java.util.Queue;

import killoffer.TreeNode;

public class InvertBinaryTree {
	public void invertBinaryTree(TreeNode root) {
        // write your code here
        Queue<TreeNode> queue1= new LinkedList<TreeNode>() ;

        queue1.offer(root);
        while(!queue1.isEmpty()){
            TreeNode getNode = queue1.remove();
            swap(getNode);
            if(getNode.left!=null){
                queue1.offer(getNode.left);
            }
            if(getNode.right!=null){
                queue1.offer(getNode.right);
            }
            
        }
    }
    private void swap(TreeNode root){
        TreeNode tmp = null;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
