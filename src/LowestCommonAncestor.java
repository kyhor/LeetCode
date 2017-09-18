
public class LowestCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Definition for a binary tree node.
		 * public class TreeNode {
		 *     int val;
		 *     TreeNode left;
		 *     TreeNode right;
		 *     TreeNode(int x) { val = x; }
		 * }
		 */
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        TreeNode cur = root; 
        
        while (cur.left != null || cur.right != null){
            
            if (p.val < cur.val && q.val < cur.val){ //same direction so lower is possilble
                
                cur = cur.left;   
                
            }
            else if (p.val > cur.val && q.val > cur.val){ //same direction so lower is possilble
                
                cur = cur.right; 
                
            }
            
            else if ((p.val > cur.val && q.val < cur.val) || (p.val < cur.val && q.val > cur.val)){//split path so lowest is found
                return cur;
            }
            else{
                return cur;
            }
        }
        
        return null;
    }

}
