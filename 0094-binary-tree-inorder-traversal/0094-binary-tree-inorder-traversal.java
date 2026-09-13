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
    static void traverser(TreeNode root,List<Integer> ls){
        if(root==null){
            return;}
        traverser(root.left,ls);
        ls.add(root.val);
        traverser(root.right,ls);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        traverser(root,arr);
        return arr;
    }
}