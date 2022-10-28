
public class SubtreeOfAnotherTree
{
   static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static class BinaryTree{
        static int ind = -1;
        public static TreeNode buildTree(int[] nodes){
            ind++;
            if(nodes[ind] == -1){
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static boolean isIdentical(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
        }
        return false;
    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (subRoot == null){
        return true;
    }
    if (root == null){
        return false;
    }
    if(isIdentical(root,subRoot)){
        return true;
    }
    return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int [] nodes1 = {2,4,-1,-1,5};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);
        TreeNode subRoot = tree.buildTree(nodes1);
        boolean check = isSubtree(root,subRoot);
        System.out.println(check);
    }
}
