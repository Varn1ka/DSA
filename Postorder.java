class g27 {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    static void postorderTraversal(TreeNode root) {
        if (root == null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        System.out.print("Postorder traversal: ");
        postorderTraversal(root);
    }
}
