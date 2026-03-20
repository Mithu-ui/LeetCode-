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
    private ArrayList<Integer> iter(TreeNode root,ArrayList<Integer> list){
        if(root!=null){
            list=iter(root.left,list);
            list.add(root.val);
            list=iter(root.right,list);
        }
        return list;
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list=iter(root,new ArrayList<Integer>());
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1)) return false;
            continue;
        }
        return true;
        
    }
}