import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lowest Common Ancestor CodeEval Challenge
 * By Jarrod Z. Thibodeau
 * October 20th, 2014
 *
 * Challenge: Write a program to determine the lowest common ancestor of two nodes in a binary search tree.
 * You may hardcode the following binary search tree in your program:
 */
public class Main {

    public static void main (String[] args) throws IOException {

        //Hard Coding My Tree
        Node root =  new Node(30);
        root.right = new Node(52);
        root.left = new Node(8);
        root.left.left = new Node(3);
        root.left.right = new Node(20);
        root.left.left.left = new Node(10);
        root.left.left.right = new Node(29);

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split("\\s");
            if (lineArray.length > 0) {

                int n1 = Integer.parseInt(lineArray[0]); //First Value
                int n2 = Integer.parseInt(lineArray[1]); //Second Value


                Node LCA = lca(root, n1, n2);
                System.out.println(LCA.value);

            }
        }
    }


    //Node class that has a left and right node
    //As well as data
    static class Node{

        Node left;
        Node right;
        int value;

        public Node(int value){
            left = null;
            right = null;
            this.value = value;
        }

    }

    //Method that will find the Lowest Common Ancestor
    //This method assumes that the tree is in BST form
    private static Node lca(Node root, int n1, int n2){

        if(root == null){
            return null;
        }

        if(root.value > n1 && root.value > n2){
            return lca(root.left, n1, n2);
        }

        if(root.value < n1 && root.value < n2){
            return lca(root.right, n1, n2);
        }

        return root;
    }

}
