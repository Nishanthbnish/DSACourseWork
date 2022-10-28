import java.util.ArrayList;

public class BST
{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val); //Insert the node in Left
        }
        else{
            root.right = insert(root.right,val);//Insert the node in Right
        }
        return root;
    }
    public  static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
    public static boolean search(Node root,int key){ //O(H)
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left,key);
        } else if (root.data == key) {
            return true;
        }
        else {
            return search(root.right,key);
        }
    }

    public static Node Delete(Node root,int val){
        if(root.data > val){
            root.left = Delete(root.left,val);
        } else if (root.data < val) {
            root.right = Delete(root.right,val);
        }
        else {
            //case 1: Leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //Case 2: //one child
            if (root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            else {
                //Case 3//two child nodes
                Node IS = InOrderSuccessor(root.right);
                root.data = IS.data;
                root.right = Delete(root.right,IS.data);
            }
        }
        return root;
    }

    private static Node InOrderSuccessor(Node root) {
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void PrintInRange(Node root,int X ,int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            PrintInRange(root.left,X,Y);
            System.out.print(root.data+ " ");
            PrintInRange(root.right,X,Y);
        }
        //case 2:Search in left
        else if (root.data >= Y){
            PrintInRange(root.left,X,Y);
        }
        else {
            PrintInRange(root.right,X,Y);
        }
    }//Range Sum of BST
    public static int rangeSumBST(Node root, int low, int high) {
        if(root == null){
            return 0;
        }
        if(root.data > high) return rangeSumBST(root.left,low,high);
        if(root.data < low)return rangeSumBST(root.right,low,high);
        return root.data + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }
//    2nd solution
    //class Solution {
    //    private int ans = 0;
    //    public int rangeSumBST(TreeNode root, int low, int high) {
    //        dfs(root , low , high);
    //        return ans;
    //    }
    //
    //    private void dfs(TreeNode node , int L , int H){
    //        if(node != null){
    //            if( L <= node.val && node.val <= H)
    //                ans += node.val;
    //            if(L < node.val)
    //                dfs(node.left , L , H);
    //            if(node.val < H)
    //                dfs(node.right , L , H);
    //        }
    //    }
    //}
    public static void Root2LeafPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        //Case 1 : For Leaf Node
        if(root.left == null && root.right == null){
            PrintTheNode(path);
            System.out.println();
        }
        //Case 2: Traversal Left or Right
        // non leaf
        else {
            Root2LeafPath(root.left,path);
            Root2LeafPath(root.right, path);
        }
        //Remove the Item from the ArrayList
        //Backtracking to the previous node
        path.remove(path.size() - 1);
    }
    public static void PrintTheNode(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+ "->");
        }
        System.out.print("End");
    }

    public static void main(String[] args) {
    int [] values = {8,5,3,1,4,6,10,11,14};
    Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        System.out.println("----------------------Inorder Sequence-----------------");
        InOrder(root);
        System.out.println();
        if (search(root,15)){
            System.out.println("found");
            System.out.println("------------------Deletion of a Node in Tree------------------");
            Delete(root,15 );
            InOrder(root);
            System.out.println();
        }
        else {
            System.out.println("not Found");
        }
        System.out.println("-----------------------Print In range-----------------------");
        PrintInRange(root,1,10);
        System.out.println();
        System.out.println("-----------------------Range Sum of BST-----------------------");
        System.out.println(rangeSumBST(root,6,10));
        System.out.println("-----------------------Root to Leaf Path-----------------------");
        Root2LeafPath(root,new ArrayList<>());
    }
}
