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
    private ArrayList<Integer> iter(TreeNode root,ArrayList<Integer> lis){
        if(root!=null){
            lis=iter(root.left,lis);
            lis.add(root.val);
            lis=iter(root.right,lis);
        }
        return lis;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> lis=iter(root,new ArrayList<>());
        if(lis.size()<k) return -1;
        return lis.get(k-1);
    }
}