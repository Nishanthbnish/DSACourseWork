package Linked_List;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size ++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node; //inserting last position
        tail = node;
        size++;
    }
    //Linked List Insert using Recursion
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index == 0){
            Node temp = new Node(val,node); //to add a new node and the value inside it.
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1, node.next); //for find the next of the LL
        return node;
    }

    public void insertperticularIndex(int val,int index){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
           temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if(size <= 1)
        {
            return deleteFirst();
        }
        Node  secondlast = get(size - 2);//second last value
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;//val :- value which is deleted
    }
    //getting the index value of the linked list
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    //Delete at perticular index value using size
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value; // which is index value
        prev.next = prev.next.next; //pointing to the next variable to prev value
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> " );
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
        private int value;
        private  Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(LL first) {
        }
    }

    //Problem Questions
    // i)Remove Duplicates in the sorted LL
    public void Dupilcates(){
        Node node = head;
        //traverse
        while (node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    //Using return type Node
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null){
//            return head;
//        }
//        ListNode node = head;
//        while (node.next != null){
//            if(node.val == node.next.val){
//                node.next = node.next.next;
//            }
//            else {
//                node = node.next;
//            }
//        }
//        return head; //Because head is pointing at first index;
//    }

    //Merge Two sorted LL
    public static LL merge(LL first,LL second){
        Node f = first.head;
        Node s = second.head;

        //New LL to merge the LL
        LL ans = new LL();
        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else {
            ans.insertLast(s.value);
            s = s.next;}
        }
        //For Remaining LL
        if(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        if (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans ;
    }
    //2nd solution
    //public ListNode mergeTwoLists(ListNode l1, ListNode l2){
    //		if(l1 == null) return l2;
    //		if(l2 == null) return l1;
    //		if(l1.val < l2.val){
    //			l1.next = mergeTwoLists(l1.next, l2);
    //			return l1;
    //		} else{
    //			l2.next = mergeTwoLists(l1, l2.next);
    //			return l2;
    //		}
    //}

    //3rd solution
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode head = new ListNode(0);
//        ListNode handler = head;
//        while(l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                handler.next = l1;
//                l1 = l1.next;
//            } else {
//                handler.next = l2;
//                l2 = l2.next;
//            }
//            handler = handler.next;
//        }
//
//        if (l1 != null) {
//            handler.next = l1;
//        } else if (l2 != null) {
//            handler.next = l2;
//        }
//
//        return head.next;
//    }
    //Reverse LL
    private void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public void reverse(){
        if(size < 2 ){
            return;
        }
        Node prev = null;
        Node pres = head;
        Node next = head.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
            next = next.next;}
        }
        head = prev;
        //LeetCode Ans
        //        ListNode prev = null;
        //        ListNode present = head;
        //        ListNode next = present.next;
        //
        //        while (present != null){
        //            present.next = prev;
        //            prev = present;
        //            present = next;
        //            if(next != null){
        //            next = next.next;}
        //        }
        //        return prev;
    }

    public static void main(String[] args) {

        LL first = new LL();
        first.insertLast(1);
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);
//        first.reverse(first);

        //Second LL
        LL Second = new LL();
        Second.insertLast(4);
        Second.insertLast(8);
        Second.insertLast(12);
        Second.insertLast(16);
        LL ans = merge(first,Second);

        ans.display();

//        list.display();
//        list.Dupilcates();
//        list.display();


    }
}
