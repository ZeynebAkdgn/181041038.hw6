package Q1;

public class Q1Main {

    public static void main(String[] args) {
	// write your code here

        RedBlackTree<Integer> tree = new RedBlackTree<>();
        // Decreasing order insertion
        for ( int i=30; i>0; i=i-1) {
            tree.add(i);
        }

        System.out.println(tree.toString());


    }


}
