public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    public void insert( T data ) {
        if ( root == null ) {
            root = new Node<T>(data);
        } else {
            insertNode(data, root);
        }
    }

    @Override
    public void transversal() {

    }

    @Override
    public void insertNode(T newData, Node<T> node) {
        if ( newData.compareTo(node.getData()) < 0 ) {
            if ( node.getLeftChild() != null) {
                insertNode(newData, node.getLeftChild());
            } else {
                Node<T> newNode = new Node<T>(newData);
                node.setLeftChild(newNode);
            }
        } else {
            if ( node.getRightChild() != null) {
                Node<T> newNode = new Node<T>(newData);
                node.setRightChild(newNode);
            }
        }
    }

    @Override
    public void delete(T data) {

    }

    @Override
    public T getMax() {
        return null;
    }

    @Override
    public T getMin() {
        return null;
    }
}
