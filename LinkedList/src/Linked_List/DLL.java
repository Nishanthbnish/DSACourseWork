package Linked_List;

public class DLL
{
    private Node head;
    private Node next;

    public void insertFirst(int val){
        Node node = new Node(val); //Creating Box for the Linked_List.LL
        node.next = head; // pointing towards new node
        node.prev = null; //new node will point towards null
        if(head != null){ //head should not be null
            head.prev = node; //pointing direction towards new node
        }
        head = node;// assigning the new node to the head
    }
    //Without using tail keyword. Inserting into the last poition
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null)
        {
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
   }

   public void insert(int after , int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Doesn't exits");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }

   }
   //Finding that perticular value
    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.val == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.val + " --> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        //Printing the list in reverse order
        while (last != null){
            System.out.print(last.val + " --> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
