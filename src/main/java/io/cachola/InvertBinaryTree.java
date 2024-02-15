package io.cachola;

import java.util.Objects;

public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
        }
        return root;
    }

    public static class TreeNode {
        public TreeNode right;
        public TreeNode left;

        int val;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return val == treeNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(right, left, val);
        }
    }
}
