package killLint;

import java.util.ArrayList;
import java.util.List;

import killoffer.TreeNode;

public class BinaryTreeErgodic {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	//ǰ�����
	public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        
        if(root== null){
            return null;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        
        return list;
    }
	//�������
	public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        if(root == null){
            return null;
        }
        inorderTraversal(root.left);
        
        
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
	//�������
	public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        if(root == null){
            return null;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        
        
        return list;
    }
	
}
