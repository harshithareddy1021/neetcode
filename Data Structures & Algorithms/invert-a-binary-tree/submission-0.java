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
    public TreeNode invertTree(TreeNode root) {
        invertTre(root);
        return root;
        
    }
    private TreeNode invertTre(TreeNode n){
        if(n==null)return n;
        TreeNode l=invertTre(n.left);
        TreeNode r=invertTre(n.right);
        n.left=r;
        n.right=l;
        return n;

    }
}
