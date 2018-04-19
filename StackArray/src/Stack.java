public class Stack<T> {

    // Stack Arrays are not dynamic. You have to set the size of the array
    private T[] stack;
    private int numOfItems;

    public Stack() {
        this.stack = ( T[] ) new Object[1];
    }

    public void push ( T newData ) {
        // If stack is full, the array will double in size
        if( numOfItems == this.stack.length ) {
            resize( 2 * this.stack.length );
        }

        this.stack[numOfItems++] = newData;
    }

    public T pop() {

        T itemToPop = this.stack[--numOfItems];

        if( numOfItems > 0 && numOfItems == this.stack.length / 4) {
            resize(this.stack.length / 2);
        }

        return itemToPop;
    }

    // Empty stack
    public boolean isEmpty() {
        return this.numOfItems == 0;
    }

    // Reports the size of the size
    public int size() {
        return this.numOfItems;
    }

    // 0(N) Linear time capacity
    public void resize( int capacity) {
        T[] stackCopy = (T[]) new Object[capacity];

        // Copy the items from old stack to new stack
        for ( int i = 0; i < numOfItems; i++ ) {
            stackCopy[i] = this.stack[i];
        }

        this.stack = stackCopy;
    }
}
