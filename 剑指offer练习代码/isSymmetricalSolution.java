package killoffer;
public class isSymmetricalSolution {
	 boolean isSymmetrical(TreeNode pRoot)
	    {
	        if(pRoot == null){
	            return true;
	        }
	        return InvertTree(pRoot.left,pRoot.right);
	    }
	    public boolean InvertTree(TreeNode Lroot,TreeNode Rroot){
	        if(Lroot==null){
	            return Rroot == null;
	        }
	        if(Rroot == null){
	            return Lroot == null;
	        }
	        if(Lroot.val!=Rroot.val){
	            return false;
	        }
	        return InvertTree(Lroot.left,Rroot.right)&& InvertTree(Lroot.right,Rroot.left);
	        
	    }
}
