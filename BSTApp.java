
public class BSTApp {
    public static void main(String[] args) {
        // create a new BST instance
        BSToP a = new BSToP();
        // Root node (initially null)
        Node root = null;
        // let say entries of our BST are 8,3,10,4,7,1,14,13
        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        System.out.println(a.ifBalanced(root) != -1);
        System.out.println(a.getHeight(root));

    }
}

class Node {
    int data;
    Node left;
    Node right;
}

class BSToP {
    public Node createNewNode(int value) {
        // when create a new BST
        Node n = new Node();
        n.data = value;
        n.left = null;
        n.right = null;
        return n;

    }

    public Node insert(Node node, int data) {
        if (node == null) {
            return createNewNode(data);
        }
        // if not null then
        if (data < node.data) {
            // left node is always smaller than parent Node
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            // right node is always greater than parent Node
            node.right = insert(node.right, data);
        }

        return node;

    }

    public Node getSucessor(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node.right;
        while (temp.left != null) {
            temp = temp.left;
        }

        return temp;
    }

    public Node delete(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (node.data < value) {
            node.left = delete(node.left, value);
        }
        if (node.data > value) {
            node.right = delete(node.right, value);
        }

        if (node.left == null || node.right == null) {
            Node temp = null;
            temp = node.left == null ? temp.right : temp.left;
            if (temp == null) {
                return null;
            } else {
                return temp;
            }
        } else {
            Node sucessor = getSucessor(node);
            node.data = sucessor.data;

            delete(node.right, sucessor.data);
        }

        return node;
    }

    public int ifBalanced(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null || node.right == null) {
            return 1;
        }

        int lh = ifBalanced(node.left);
        int rh = ifBalanced(node.right);
        if (lh == -1 || rh == -1 || Math.abs(lh - rh) > 1) {
            return -1;
        }
        return Math.max(lh, rh) + 1;

    }

    public int getHeight(Node node) {

        if (node == null) {
            return 0;
        }
        if (node.left == null || node.right == null) {
            return 1;
        }

        int lh = getHeight(node.left);
        int rh = getHeight(node.right);
        if (lh == -1 || rh == -1 || Math.abs(lh - rh) > 1) {
            return -1;
        }
        return Math.max(lh, rh) + 1;

    }

}