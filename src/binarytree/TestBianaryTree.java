package binarytree;

import node.TreeNode;

/**
 * A test class for the BinaryTree implementation.
 */
public class TestBianaryTree {

    /**
     * The main entry point of the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // Create a new BinaryTree instance
        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();

        // Insert nodes into the binary tree
        binaryTree.insert(new TreeNode<Integer>(5));
        binaryTree.insert(new TreeNode<Integer>(2));

        binaryTree.insert(new TreeNode<Integer>(3));
        binaryTree.insert(new TreeNode<Integer>(7));
        binaryTree.insert(new TreeNode<Integer>(4));
        binaryTree.insert(new TreeNode<Integer>(1));
        binaryTree.insert(new TreeNode<Integer>(1));

        // Display the binary tree
        binaryTree.display();

        // Check if a node with value 2 exists in the binary tree
        System.out.println(binaryTree.exists(2));

        // Delete a node with value 1 from the binary tree
        binaryTree.delete(2);

        // Display the binary tree after deletion
        binaryTree.display();
    }

}
