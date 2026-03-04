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
    private List<Integer> inorder(TreeNode root,List<Integer> list){
        if(root!=null){
            list=inorder(root.left,list);
            list.add(root.val);
            list=inorder(root.right,list);
        }
        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        return inorder(root,list);
    }
}