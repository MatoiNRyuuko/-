package killLint;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import killoffer.TreeNode;

public class LevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        if(root == null){
            return list1;
        }
        
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        queue1.offer(root);
        
        while(!queue1.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int size = queue1.size();
            for(int i = 0;i<size;i++){
                TreeNode out = queue1.poll();
                if(out.left!=null){
                    queue1.offer(out.left);
                }
                if(out.right!=null){
                    queue1.offer(out.right);
                }
                level.add(out.val);
            }
            list1.add(level);
        }
        return list1;
        
    }
}
