public class LowestCommonancestors2 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;

        }
        Node leftlca = lca(root.left, n1, n2);
        Node rightlca = lca(root.right, n1, n2);

        // leftlca has val && rightlca is null
        if (rightlca == null) {
            return leftlca;

        }
        // rightlca has val && rightlca is null
        if (rightlca == null) {
            return leftlca;

        }
        return root;

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

        int n1 = 4; // Specify values for n1 and n2
        int n2 = 7;

        System.out.println((lca(root, n1, n2)).data);
    }
}
