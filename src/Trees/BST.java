package Trees;

public class BST {

    class Node {

        int item;
        Node left, right;

        Node(int data) {
            item = data;
            left = right = null;
        }
    }
    Node root;

    BST() {
        root = null;
    }

    public static void main(String args[]) {
        BST obj = new BST();
        obj.insert(8);
        obj.insert(3);
        obj.insert(1);
        obj.insert(6);
        obj.insert(7);
        obj.insert(10);
        obj.insert(14);
        obj.insert(4);

        System.out.print("Inorder traversal: ");
        obj.inorder();
        System.out.println("\n\nAfter deleting 10");
        obj.deleteKey(10);
        System.out.print("Inorder traversal: ");
        obj.inorder();
    }

    private void insert(int key) {
        root = insertNode(root, key);
    }

    private Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.item) {
            root.left = insertNode(root.left, key);
        } else if (key > root.item) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    private void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.item + " -> ");
            inorderRec(root.right);
        }
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.item) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.item) {
            root.right = deleteRec(root.right, key);
        } else {
            //if root has only one children
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //if the node has two children
            // Place the inorder successor in position of the node to be deleted
            root.item = minValue(root.right);
            //delete the the inorder successor
            root = deleteRec(root.right, root.item);
        }
        return root;
    }

    private int minValue(Node root) {
        int minv = root.item;
        while (root.left != null) {
            minv = root.left.item;
            root = root.left;
        }
        return minv;
    }
}
