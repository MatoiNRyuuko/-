package killLint;

import java.util.ArrayList;
import java.util.List;

import killoffer.TreeNode;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        List<String> result = new ArrayList<String>();
        if(root == null){
            return result;
        }
        String path = "";
        toString(result,path,root);
        return result;
    }
    private void toString(List<String> result,String path,TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null&&root.right == null){
            if(path.equals("")){
                path += root.val;
                result.add(path);
            }else{
                path += "->"+root.val;
                result.add(path);
            }
            return;
        }
        if(path.equals("")){
            path += root.val;
        }else{
            path += "->"+root.val;
        }
        toString(result,path,root.left);
        toString(result,path,root.right);
    }
}
