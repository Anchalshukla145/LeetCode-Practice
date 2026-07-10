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
    void preorder(TreeNode root,List<Integer>arr){
        if(root==null){arr.add(null); return ;}
        arr.add(root.val);
        preorder(root.left, arr);
        preorder(root.right,arr);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        preorder(p,arr1);
        preorder(q,arr2);
         return arr1.equals(arr2);
    }
}