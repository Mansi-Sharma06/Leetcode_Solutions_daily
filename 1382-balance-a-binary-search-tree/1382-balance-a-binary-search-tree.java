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
    public TreeNode balanceBST(TreeNode root) {
        // list to store inorder traversal of BST
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);

        // construct and return balanced BST
        return createBalancedBST(inorder, 0, inorder.size() - 1);
    }

    private void inorderTraversal(TreeNode root, List<Integer> inorder){
        // perform inorder traversal to store the element in sorted order

        if(root == null) return;
        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }

    private TreeNode createBalancedBST(
        List<Integer> inorder,
        int start,
        int end
    ){
        // base case - start index > end index
        if(start > end) return null;

        // find mid element of current range
        int mid = start + (end - start) / 2;

        // recursively construct left and right subtrees
        TreeNode leftSubtree = createBalancedBST(inorder, start, mid - 1);
        TreeNode rightSubtree = createBalancedBST(inorder, mid + 1, end);

        // create new node with middle element and attach the subtrees

        TreeNode node = new TreeNode(
            inorder.get(mid),
            leftSubtree,
            rightSubtree
        );
        return node; 
    }
}