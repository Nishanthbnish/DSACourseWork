import java.util.*;

public class PraBinaryQuestions
{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    static class BinaryTree{
        static int ind = -1;
        public static Node buildTree(int[] nodes){
            ind++;
            if(nodes[ind] == -1){
                return null;
            }
            Node newNode = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    //94. Binary Tree Inorder Traversal
    static ArrayList<Integer> list = new ArrayList<>();
    public static List<Integer> inorderTraversal(Node root)
    {

    if (root == null){
        return new ArrayList<>();
    }
    inorderTraversal(root.left);
    list.add(root.data);
    inorderTraversal(root.right);

    return list;
}
//
public static List<Integer> inorder(Node root, List<Integer> nums) {
    if (root == null) return new ArrayList<>();
    inorder(root.left, nums);
    nums.add(root.data);
    inorder(root.right, nums);
    return nums;
}
    public static ArrayList<Integer> Postorder(Node root,List<Integer> nums)
    {

        if (root == null){
            return new ArrayList<>();
        }
        Postorder(root.left,nums);
        Postorder(root.right,nums);
        nums.add(root.data);
        return (ArrayList<Integer>) nums;
    }
    public boolean isSameTree(Node p, Node q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.data == q.data)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }
    //101 : LeetCode :Symmetric
    public boolean isSymmetric(Node root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.data ==q.data) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }

    //102: Binary Tree Level Order Traversal
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Node cur = q.poll();
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
                level.add(cur.data);
            }
            res.add(level);
        }

        return res;
    }
    public static int HeightNode(Node root) {
        //base condition
        if (root == null) {
            return 0; //Null == 0;
        }
        int leftHieght = HeightNode(root.left);
        int rightHeight = HeightNode(root.right);
        if (leftHieght > rightHeight) {
            return leftHieght + 1;
        }
        return rightHeight + 1;
    }
    public static ArrayList<Integer> reverseLevelOrder(Node node)
    {

        ArrayList<Integer> list = new ArrayList<>();

        if(node == null) return list;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
//        System.out.println(q.peek());
        while(!q.isEmpty()){
            Node temp = q.peek();
            q.remove();
            if(temp.right != null){
                q.add(temp.right);
            }
            if(temp.left != null){
                q.add(temp.left);
            }
            list.add(temp.data);
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        int[] nodes = {7, 9, 4, -1,-1,9, 6, 10, -1,-1, 10,-1,-1, 6};
        BinaryTree tree  = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(inorderTraversal(root));
        System.out.println(inorder(root,new ArrayList<>()));
        System.out.println(Postorder(root,new ArrayList<>()));
        System.out.println(levelOrder(root));
        System.out.println(HeightNode(root));
        System.out.println(reverseLevelOrder(root));
    }
}
