public class ArrayClass {

    private int[] arr;
    private int nElements =  arr.length;
    int temp;
    String value;

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

    public int ascending( int startingPoint ) {
        for ( int i = startingPoint; i < nElements; i++) {
            for ( int j = i + 1; j < nElements; j++ ) {
                if ( arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            value = System.out.println(arr[i]);
        }

        return arr[startingPoint];
    }

}
