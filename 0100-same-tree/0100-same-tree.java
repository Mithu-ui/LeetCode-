/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean dfs(TreeNode p,TreeNode q){
        if((p!=null && q!=null) && p.val==q.val){
            boolean right=dfs(p.right,q.right);
            boolean left=dfs(p.left,q.left);
            return right&&left;
        }else if(p==null && q==null){
            return true;
        }else if(p==null && q!=null){
            return false;
        }else if(p!=null && q==null){
            return false;
        } else if(p.val!=q.val){
            return false;
        }
        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(!dfs(p,q)){
            return false;
        }
        return true;
    }
}