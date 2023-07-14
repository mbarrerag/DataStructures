package binarytree;

import implementationtree.ImplementationTree;
import node.TreeNode;

/**
 * A binary tree implementation that implements the ImplementationTree interface.
 *
 * @param <T> the type of data stored in the tree nodes
 */
public class BinaryTree<T> implements ImplementationTree<T> {

    // Instance variables
    public TreeNode<T> root;

    /**
     * Constructs an empty binary tree.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Checks if the binary tree is empty.
     *
     * @return true if the tree is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return (root == null);
    }

    /**
     * Makes the binary tree empty by setting the root to null.
     */
    @Override
    public void makeEmpty() {
        root = null;
    }

    /**
     * Checks if a node with the given id exists in the binary tree.
     *
     * @param id the id to search for
     * @return true if a node with the given id exists, false otherwise
     */
    @Override
    public boolean exists(int id) {
        if (root != null) {
            if (root.getData() > id) {
                if (root.getLeftChild() != null) {
                    try {
                        if (getHelper(root.getLeftChild(), id).getData() != id) {
                            return false;
                        } else {
                            return true;
                        }
                    } catch (NullPointerException e) {
                        return false;
                    }
                }
            } else {
                if (root.getData() < id) {
                    if (root.getRightChild() != null) {
                        try {
                            if (getHelper(root.getRightChild(), id).getData() != id) {
                                return false;
                            } else {
                                return true;
                            }
                        } catch (NullPointerException e) {
                            return false;
                        }
                    }
                } else {
                    if (root.getData() == id) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    /**
     * Helper method to recursively search for a node with the given id in the binary tree.
     *
     * @param root the root of the current subtree
     * @param id the id to search for
     * @return the node with the given id if found, null otherwise
     */
    public TreeNode<T> getHelper(TreeNode<T> root, int id) {
        if (root != null) {
            if (root.getData() == id) {
                return root;
            } else {
                if (root.getData() < id) {
                    return getHelper(root.getRightChild(), id);
                } else {
                    return getHelper(root.getLeftChild(), id);
                }
            }
        }
        return null;
    }

    /**
     * Inserts a new tree node into the binary tree.
     *
     * @param treeNode the tree node to insert
     */
    @Override
    public void insert(TreeNode<T> treeNode) {
        root = insertHelper(root, treeNode);
    }

    /**
     * Helper method to recursively insert a new tree node into the binary tree.
     *
     * @param root the root of the current subtree
     * @param treeNode the tree node to insert
     * @return the modified subtree with the new node inserted
     */
    private TreeNode<T> insertHelper(TreeNode<T> root, TreeNode<T> treeNode) {
        if (root == null) {
            root = treeNode;
            return root;
        } else {
            if (root.getData() < treeNode.getData()) {
                root.setRightChild(insertHelper(root.getRightChild(), treeNode));
            } else if (root.getData() > treeNode.getData()) {
                root.setLeftChild(insertHelper(root.getLeftChild(), treeNode));
            }
        }
        return root;
    }

    /**
     * Displays the binary tree in in-order traversal.
     */
    public void display() {
        displayHelper(root);
    }

    /**
     * Helper method to recursively display the binary tree in in-order traversal.
     *
     * @param root the root of the current subtree
     */
    private void displayHelper(TreeNode<T> root) {
        if (root != null) {
            displayHelper(root.getLeftChild());
            System.out.println(root.getData());
            displayHelper(root.getRightChild());
        }
    }

    /**
     * Deletes a node with the given id from the binary tree.
     *
     * @param id the id of the node to delete
     */
    @Override
    public void delete(int id) {
        if (exists(id)) {
            root = deleteHelper(root, id);
        } else {
            System.out.println("We couldn't find the node with the number " + id);
        }
    }

    /**
     * Helper method to recursively delete a node with the given id from the binary tree.
     *
     * @param root the root of the current subtree
     * @param id the id of the node to delete
     * @return the modified subtree with the node deleted
     */
    public TreeNode<T> deleteHelper(TreeNode<T> root, int id) {
        if (root == null) {
            return root;
        } else if (id < root.getData()) {
            root.setLeftChild(deleteHelper(root.getLeftChild(), id));

        } else if (id > root.getData()) {
            root.setRightChild(deleteHelper(root.getRightChild(), id));
        } else {
            if (root.getLeftChild() == null && root.getRightChild() == null) {
                root = null;
            } else if (root.getRightChild() != null) {
                // Right node has a child, find a successor
                root.setData(successor(root));
                root.setRightChild(deleteHelper(root.getRightChild(), root.getData()));
            } else if (root.getLeftChild() == null) {
                // Find a predecessor
                root.setData(predecessor(root));
                root.setLeftChild(deleteHelper(root.getLeftChild(), root.getData()));
            }
        }
        return root;
    }

    /**
     * Finds the successor of a node in the binary tree.
     *
     * @param root the node for which to find the successor
     * @return the value of the successor node
     */
    private int successor(TreeNode<T> root) {//find the least value below the right child of this root node
        root = root.getRightChild();
        while (root.getLeftChild() != null) {
            root = root.getLeftChild();
        }
        return root.getData();
    }

    /**
     * Finds the predecessor of a node in the binary tree.
     *
     * @param root the node for which to find the predecessor
     * @return the value of the predecessor node
     */
    private int predecessor(TreeNode<T> root) {//find the greatest value below the left child of this root node
        root = root.getLeftChild();
        while (root.getRightChild() != null) {
            root = root.getRightChild();
        }
        return root.getData();
    }
}
