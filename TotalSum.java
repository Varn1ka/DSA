class g27 {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    static int sumOfNodes(TreeNode root){
        if(root==null)
            return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
    public static void main(String[]args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right= new TreeNode(7);
        int totalSum = sumOfNodes(root);
        System.out.println("Sum of all node values: " + totalSum);
    }
}
