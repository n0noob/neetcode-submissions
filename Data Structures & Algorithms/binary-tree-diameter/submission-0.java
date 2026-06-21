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
    int maxPathLength = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxPathLength;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        maxPathLength = Math.max(maxPathLength, l + r);

        return Math.max(l, r) + 1;
    }
}
