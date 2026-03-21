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
    private int height(TreeNode root){
        if(root==null) return 0;
        
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
    }
    private boolean isValid(int leftHeight,int rightHeight){
        int bal=leftHeight-rightHeight;
        if(bal==0 || bal==1 || bal==-1) return true;
        return false;
    }
    private boolean isBalancedHelp(TreeNode root,boolean prev){
        if(root==null) return true;
        if(!prev) return prev;
        boolean res=isValid(height(root.left),height(root.right));
        if(!res) return res;
        return isBalancedHelp(root.left,res) && isBalancedHelp(root.right,res);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return isBalancedHelp(root,isValid(height(root.left),height(root.right)));
    }
}