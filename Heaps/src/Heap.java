public class Heap {
    private Integer[] heap; // One dimensional array of integers
    private int currentPosition = -1; // Initialized to be -1 at the beginning

    // Constructor: grabs the size of the new array
    public Heap ( int size ) {
        this.heap = new Integer[size];
    }

    public void insert( int item ) {

        if ( isFull() ) {
            throw new RuntimeException("Heap is full... ");
        }

        this.heap[++currentPosition] = item;
        fixUp(currentPosition);
    }

    private void fixUp ( int index ) {
        int parentIndex = ( index - 1 ) / 2;

        // Ensuring that the Parent Node is greater than the Child Node
        while ( parentIndex >= 0 && this.heap[parentIndex] < this.heap[index] ) {
            int temp = this.heap[index];
            this.heap[index] = this.heap[parentIndex];
            this.heap[parentIndex] = temp;
            index = parentIndex;
            parentIndex = ( index - 1 ) / 2;
        }

    }

    private boolean isFull() {
        return this.currentPosition ==  this.heap.length;
    }
}
