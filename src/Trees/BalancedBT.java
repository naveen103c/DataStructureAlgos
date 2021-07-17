package Trees;


public class BalancedBT {
//O(n2)
    Node root;

    public static void main(String args[]) {
        BalancedBT obj = new BalancedBT();
        obj.root = new Node(1);
        obj.root.l = new Node(2);
        obj.root.r = new Node(3);
        obj.root.l.l = new Node(4);
        obj.root.l.r = new Node(5);

        //if(isBalancedBT(obj.root,ht.height))
        if (isBalancedBT(obj.root)) {
            System.out.print("Yes Balanced BT");
        } else {
            System.out.print("Yes Balanced BT");
        }
    }

    private static int height(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.l), height(node.r));
    }

    private static boolean isBalancedBT(Node node) {
        if (node == null) {
            return true;
        }
        int lh = height(node.l);
        int rh = height(node.r);
        if ((Math.abs(lh - rh)) <= 1 && isBalancedBT(node.l) && isBalancedBT(node.r)) {
            return true;
        }
        return false;
    }

}
