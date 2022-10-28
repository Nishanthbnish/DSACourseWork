import java.awt.desktop.QuitEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_trees
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
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");//Root
        preorder(root.left);//Left
        preorder(root.right);//Right

    }
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left); //Left
        System.out.print(root.data+ " "); //Root
        Inorder(root.right); //Right

    }
    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Postorder(root.left); //Left
        Postorder(root.right); //Right
        System.out.print(root.data+ " "); //Root

    }
    public static List<Integer> postorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
    if (root == null){
        return new ArrayList<>();
    }
    postorderTraversal(root.left);
    postorderTraversal(root.right);
    list.add(root.data);
    return list;
    }
    public static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>(); //Creating Queue Data Structure
        queue.add(root);// Adding the first node and passing the entire root node
        queue.add(null);
        //untill queue not gets empty
        int level = 1;
//        int sum = SumNode();
        while (!queue.isEmpty()){
            Node currNode = queue.remove(); //remove the current node in the queue
            if(currNode == null){

                System.out.print("   L" + level++  );
                System.out.println(); //Next line
                if (queue.isEmpty()){ //For the last node in the queue
                    break;
                }
                else {
                    queue.add(null); //add null --> after the null is getting removed in queue
                }
            }
            else {

                System.out.print(currNode.data + " "); //Printing the nodes
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }

        }
    }
    public static int CountNode(Node root){
        //base condition
        if(root == null){
            return 0; //Null == 0;
        }
        int left = CountNode(root.left);
        int right = CountNode(root.right);

        return left + right + 1; //counts total node in the tree and returns
    }

    public static int SumNode(Node root){
        //base condition
        if(root == null){
            return 0; //Null == 0;
        }
        int leftSum = SumNode(root.left);
        int rightSum = SumNode(root.right);

        return leftSum + rightSum + root.data; //counts total node in the tree and returns
    }
    public static boolean hasPathSum(Node root, int targetSum) {
       if(SumPathNode(root,targetSum) == targetSum){
           return true;
       }
       return false;
    }
    //Same solution for above question if ther is null in the values
    public static boolean hasPathSums(Node root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null) return sum == root.data;

        return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data);
    }
    public static int SumPathNode(Node root,int targetSum){
        //base condition
        if(root == null){
            return 0; //Null == 0;
        }
        int leftSum = SumPathNode(root.left,targetSum);
        int rightSum = SumPathNode(root.right,targetSum);

        return leftSum + rightSum + root.data; //counts total node in the tree and returns
    }

    public static int HeightNode(Node root){
        //base condition
        if(root == null){
            return 0; //Null == 0;
        }
        int leftHieght = HeightNode(root.left);
        int rightHeight = HeightNode(root.right);

       int maxHieght = Math.max(leftHieght,rightHeight) + 1;
       return maxHieght;
    }
    //LeetCode Is Balanced Binary tree
    private static boolean result = true;
    public static boolean isBalanced(Node root) {
        maxDepth(root);
        return result;
    }
    public static int maxDepth(Node root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1)
            result = false;
        return 1 + Math.max(l, r);
    }
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = Diameter(root.left);
        int diam2 = Diameter(root.right);
        int diam3 = HeightNode(root.left) + HeightNode(root.right)  + 1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }
    //Leetcode 543 solution Diameter
    public class Solution {
        int max = 0;

        public int diameterOfBinaryTree(Node root) {
            maxDepth(root);
            return max;
        }

        private int maxDepth(Node root) {
            if (root == null) return 0;

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            max = Math.max(max, left + right);

            return Math.max(left, right) + 1;
        }
    }
    public static class TreeInfo{
        int ht;
        int diameter;


        public TreeInfo(int ht, int diaml) {
            this.ht = ht;
            this.diameter = diaml;
        }
    }
    //Find the Diameter using O(n)
    public static TreeInfo Diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = Diameter2(root.left);
        TreeInfo right = Diameter2(root.right);

        int myheight = Math.max(left.ht,right.ht) + 1; //To find the height of the tree
        //Diameter
        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam3,Math.max(diam1,diam2));

        TreeInfo myInfo = new TreeInfo(myheight,mydiam); //Pass the diam val and height val
        return myInfo; //return tree;
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4, -1,-1,5,-1,-1,3,-1,6,-1,-1};
//        int []nodes = {1,2,3,4,5};
        BinaryTree tree  = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("----------Preorder Traversal-------------");
        preorder(root);
        System.out.println();
        System.out.println("----------Inorder Traversal------------");
        Inorder(root);
        System.out.println();
        System.out.println("----------Postorder Traversal------------");
        Postorder(root);
        System.out.println();
        System.out.println("----------LevelOrder Traversal------------");
        LevelOrder(root);
        System.out.println("----------Count Node In Tree------------");
        System.out.println(CountNode(root));
        System.out.println("----------Sum oF Nodes In Tree------------");
        System.out.println(SumNode(root));
        System.out.println("----------Height of Nodes In Tree------------");
        System.out.println(HeightNode(root));
        System.out.println("----------Diameter of Nodes O(N^2)------------");
        System.out.println(Diameter(root));
        System.out.println("----------Diameter2 of Nodes Opt O(N) ------------");
        System.out.println(Diameter2(root).diameter); //it's how you access the val from tree

        //Balanced Tree
        System.out.println(isBalanced(root));

        //leetcode :112
//        System.out.println(hasPathSums(root,21));
    }

}
