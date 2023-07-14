package binarytree;
import node.TreeNode;
public class TestBianaryTree {

    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        binaryTree.insert(new TreeNode<Integer>(5));
       binaryTree.insert(new TreeNode<Integer>(3));
       binaryTree.insert(new TreeNode<Integer>(7));
        binaryTree.insert(new TreeNode<Integer>(1));
        binaryTree.insert(new TreeNode<Integer>(1));
        binaryTree.display();
        System.out.println(binaryTree.exists(2));
        binaryTree.delete(1);
        binaryTree.display();
    }

}
