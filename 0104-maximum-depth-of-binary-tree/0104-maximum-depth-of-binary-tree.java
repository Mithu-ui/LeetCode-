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
    private int max(int a,int b){
        return (a>b)?a:b;
    }
    private int dfs(TreeNode root,int count){
        if(root==null){
            return count;
        }
        else if(root.left==null && root.right==null){
            return count+1;
        }else if(root.left==null && root.right!=null){
            return dfs(root.right,count+1);
        }else if(root.left!=null && root.right==null){
            return dfs(root.left,count+1);
        }else{
            return max(dfs(root.left,count+1),dfs(root.right,count+1));
        }
    }
    public int maxDepth(TreeNode root) {
        return dfs(root,0);
    }
}