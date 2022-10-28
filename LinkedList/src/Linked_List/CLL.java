package Linked_List;

public class CLL
{
    private Node head;
    private Node tail;
// Cmd + n :- to create Constructor
    public CLL() {
        this.head = null;
        this.tail = null ;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node node = head; //traverse

        if(node == null){
            return;
        }

        if(node.val == val){ //if node is equal to first element
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
        }
            node = node.next;
        }while (node != head);
    }

    public void display(){
        Node node = head;
        if(node != null){
            do {
                System.out.print(node.val + " --> ");
                node = node.next;
            }while (node != head); //completes one circle and check with head. until the condition gets false.
        }
//        while (temp != tail){
//            System.out.println(temp.val + " --> " );
//            temp = temp.next;
//        }
        System.out.println("Head");
    }

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

    }
}
