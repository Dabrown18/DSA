public class ArrayClass {

    private int[] arr;

    // Create an Array
    public ArrayClass( int size ) {
        arr = new int[size];
    }

    // Input contents of Array
    public void setElements(int index, int value) {
        arr[index] = value;
    }

    // Get contents of Array
    public int getElements( int index) {
        return arr[index];
    }

}
