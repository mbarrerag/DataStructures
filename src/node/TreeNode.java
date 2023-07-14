package node;

public class TreeNode<T> implements Comparable<TreeNode<T>>{

    protected TreeNode<T> leftChild;
    protected TreeNode<T> rightChild;

    protected int data;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public int compareTo(TreeNode<T> o) {
        int exit;
        if (o.getData() < this.data){
            exit = 1;
        } else if (o.getData() > this.data){
            exit = -1;
        } else {
            exit = 0;
        }
        return exit;
    }

    protected void insert() {

    }
}
