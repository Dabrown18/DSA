public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        /*
            hashTable.put(1,10);
            hashTable.put(1,100);
            hashTable.put(1,1000);
        */

        int i = 1;

        while (i < 10)

            if ((i++) % 2 == 0)

                System.out.println(i);

    }
}
