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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int ln=minDepth(root.left);
        int rn=minDepth(root.right);
        if(ln==0)return 1+rn;
        if(rn==0)return 1+ln;
        return 1+Math.min(ln,rn);
        
    }
}