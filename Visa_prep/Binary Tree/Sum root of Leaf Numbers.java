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
    public int calculate_sum(TreeNode root, int current_sum) {
        if (root == null) {
            return 0; // If the node is null, return 0
        }

        // Update the current sum
        current_sum = current_sum * 10 + root.val;

        // If the node is a leaf, return the current sum
        if (root.left == null && root.right == null) {
            return current_sum;
        }

        // Recursively calculate the sum for left and right subtrees
        int leftNum = calculate_sum(root.left, current_sum);
        int rightNum = calculate_sum(root.right, current_sum);

        // Return the total sum
        return leftNum + rightNum;
    }

    public int sumNumbers(TreeNode root) {
        return calculate_sum(root, 0);
    }
}
