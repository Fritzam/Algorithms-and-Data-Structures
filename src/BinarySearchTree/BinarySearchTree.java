package BinarySearchTree;

class BinarySearchTree {
    Node root;

    void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if(root == null) {
            root = node;
            return root;
        } else if(data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    void display() {
        displayHelper(root);
    }
    private void displayHelper(Node root){
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }
    void remove(int data) {
        if(search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found.");
        }
    }
    private Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        } else if(data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            //Node found
            if(root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                //Find a successor to replace this node.
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                //Find a predecessor to replace this node.
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(Node root) {
        //Find the least value below the right child of this root node.
        root = root.right;
        while(root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root) {
        //Find the greatest value below the left child of this root node.
        root = root.left;
        while(root.left != null) {
            root = root.right;
        }
        return root.data;
    }
}