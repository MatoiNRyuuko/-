package killLint;

import killoffer.TreeNode;

public class InvertBinaryTreeRecursion {
	public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root == null){
            return ;
        }
        //�ݹ鷴ת��������
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }
}
