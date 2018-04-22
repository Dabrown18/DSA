public class Main {

    public static void main(String[] args) {
        Tree<Integer> bat = new BinarySearchTree<>();

        bat.insert(10);
        bat.insert(100);
        bat.insert(1000);

        bat.traversal();
    }
}
