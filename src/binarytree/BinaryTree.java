package binarytree;

import implementationtree.ImplementationTree;
import node.TreeNode;

public class BinaryTree<T> implements ImplementationTree<T> {


    public TreeNode<T> root;
    public TreeNode<T> originalRoot;

    public BinaryTree() {
        root = null;
    }


    @Override
    public boolean isEmpty() {
        return (root == null);
    }

    @Override
    public void makeEmpty() {
        root = null;
    }


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
                    }catch (NullPointerException e){
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

    @Override
    public void insert(TreeNode<T> treeNode) {
        root = insertHelper(root, treeNode);
    }



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

        public void display() {

              displayHelper(root);

            }

            private void displayHelper(TreeNode<T> root) {

                if (root != null) {

                    displayHelper(root.getLeftChild());
                    System.out.println(root.getData());
                    displayHelper(root.getRightChild());
                }
            }

        @Override
        public void delete (int id){
            if(exists(id)){
                root = deleteHelper(root, id);
            } else {
                System.out.println("We could find the node with the number" + id );
            }
        }

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
                } else if (root.getRightChild() != null) { //Right node has a child find a succesor
                    root.setData(successor(root));
                    root.setRightChild(deleteHelper(root.getRightChild(), root.getData()));
                } else if (root.getLeftChild() == null) { //Find a predecesor
                    root.setData(predecessor(root));
                    root.setLeftChild(deleteHelper(root.getLeftChild(), root.getData()));

                }

            }
            return root;
        }
            private int successor(TreeNode<T> root) {
                root = root.getRightChild();
                while (root.getLeftChild() != null) {
                    root = root.getLeftChild();
                }
                return root.getData();
            }

            private int predecessor(TreeNode<T> root) {
                root = root.getRightChild();
                while (root.getLeftChild() != null) {
                    root = root.getLeftChild();
                }
                return root.getData();
            }

    }
