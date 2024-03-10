package day2;

public class BinarySearchTree {
    TreeNode root;

    public void insert(int data) {
       root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if(root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.val) {
            root.left = insertRec(root.left, data);
        } else {
            root.right =  insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder(TreeNode root){
        if(root == null) return;

        inOrder(root.left);
        System.out.println(" "+root.val);
        inOrder(root.right);
    }

    public void preOrder(TreeNode root){
        if(root == null) return;

        System.out.println(" "+root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(" "+root.val);
    }
        public static void main(String []args) {
            BinarySearchTree bst = new BinarySearchTree();
            bst.insert(50);
            bst.insert(30);
            bst.insert(70);
            bst.insert(20);
            bst.insert(40);

            System.out.println("Is 40 present in the BST? " + bst.search(40));
            System.out.println("Is 60 present in the BST? " + bst.search(60));

            System.out.println("In Order Traversal");
            bst.inOrderTraversal();
            System.out.println("Pre Order Traversal");
            bst.preOrderTraversal();
            System.out.println("Post Order Traversal");
            bst.postOrderTraversal();
        }

    private void inOrderTraversal() {
        inOrder(root);
    }
    private void preOrderTraversal() {
        preOrder(root);
    }

    private void postOrderTraversal() {
        postOrder(root);
    }


    private boolean search(int i) {
        return searchRec(root, i);
    }

    private boolean searchRec(TreeNode root, int i) {
        if(root == null)
            return false;

        if(root.val == i)
            return true;
        else if(i < root.val) {
           return searchRec(root.left, i);
        } else {
            return searchRec(root.right, i);
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
