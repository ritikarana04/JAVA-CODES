public class Subtree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node SubRoot) {
        if (node == null && SubRoot == null) {
            return true;
        } else if (node == null || SubRoot == null || node.data != SubRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, SubRoot.left)) {
            return false;
        }
        return isIdentical(node.right, SubRoot.right); // Fixed the return statement here
    }

    public static boolean isSubTree(Node root, Node SubRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == SubRoot.data) {
            if (isIdentical(root, SubRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, SubRoot) || isSubTree(root.right, SubRoot); // Added return statement
    }

    public static void main(String args[]) {
        /*
         * 1
         * /\
         * 2 3
         * /\ /\
         * 4 5 6 7
         * 
         * 
         * 
         * 
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         * 2
         * /\
         * 4 5
         * 
         * 
         * 
         * 
         * 
         */

        Node SubRoot = new Node(2);
        SubRoot.left = new Node(4);
        SubRoot.right = new Node(5);
        System.out.println(isSubTree(root, SubRoot));
    }

}
