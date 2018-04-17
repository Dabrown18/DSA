public class Stack<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    public void push( T newData ) {
        this.count++;

        if ( this.root == null ) {
            this.root = new Node<>(newData);
        }
    }

}
