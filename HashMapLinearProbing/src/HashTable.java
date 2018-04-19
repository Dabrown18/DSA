public class HashTable {

    private HashItem[] hashTable;

    public HashTable() {
        this.hashTable = new HashItem[Constants.TABLE_SIZE];
    }

    // How to retrieve values
    public int get( int key ) {

        int generatedIndex = hashFunction(key);

        while ( hashTable[generatedIndex] != null && hashTable[generatedIndex].getKey() == key ) {
            // Mapping to the next index
            System.out.println("Mapping to index");
            generatedIndex = (generatedIndex + 1) % Constants.TABLE_SIZE;
        }

        if ( hashTable[generatedIndex] == null ) {
            return -1;
        } else {
            return hashTable[generatedIndex].getValue();
        }

    }

    // How to insert values
    public void put( int key, int value ) {
        int generatedIndex = hashFunction(key);

        while ( hashTable[generatedIndex] != null ) {
            // Collision -> next Index is generated
            System.out.println("Collision");
            generatedIndex = ( generatedIndex + 1 ) % Constants.TABLE_SIZE;
        }

        // Value inserted into the generated index
        System.out.println("Inserted value into generated index");
        hashTable[generatedIndex] = new HashItem(key, value);
    }

    private int hashFunction( int key ) {
        return key % Constants.TABLE_SIZE;
    }
}
