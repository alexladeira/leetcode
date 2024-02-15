package io.cachola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.cachola.InvertBinaryTree.TreeNode;

class InvertBinaryTreeTest {

    @Test
    void invertTree() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        TreeNode expected = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(4)), new TreeNode(2, new TreeNode(7), new TreeNode(6)));
        TreeNode actual = InvertBinaryTree.invertTree(root);
        assertEquals(expected, actual);
    }

}