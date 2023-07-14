package implementationtree;

import node.TreeNode;

public interface ImplementationTree<T> {

    boolean isEmpty();
    void makeEmpty();
    boolean exists(int id);

    void insert(TreeNode<T> treeNode);
    void delete(int id);

}
