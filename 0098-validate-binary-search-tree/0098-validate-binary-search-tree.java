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
    public boolean isValidBST(TreeNode r) {
        if(r.left==null && r.right==null) return true;
        return borole(r, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean borole( TreeNode r, long min, long max){
        if(r==null) return true;
        if((long)r.val<=min || (long)r.val>=max) return false;
       
        return borole(r.left, min, (long)r.val) && borole(r.right, (long)r.val, max);
        
    }
}