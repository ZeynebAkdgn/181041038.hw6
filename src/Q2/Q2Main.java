package Q2;

import Q1.RedBlackTree;

import java.util.Random;

public class Q2Main {

    public static void main(String[] args) {
	// write your code here


        BTree<Integer> tree = new BTree<>(4);
        Random generator = new Random();

        for ( int i=1; i<20; i++) {
            tree.add(generator.nextInt(100));
        }

        System.out.println(tree);

    }


}
