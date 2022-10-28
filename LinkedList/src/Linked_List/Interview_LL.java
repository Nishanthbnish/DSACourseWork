package Linked_List;

//Linked List cycle
public class Interview_LL
{
    public ListNode head;
    public boolean hasCycle(ListNode head) {
        ListNode fast = head; //it should start from begining
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next; //run 2 times faster
            slow = slow.next; //one time

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    //Finding the Lenght of LL
    public int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
    //Finding the length of the cycle
    public static int lengthCycle(ListNode head) {
        ListNode fast = head; //it should start from begining
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next; //run 2 times faster
            slow = slow.next; //one time

            if(fast == slow){
                ListNode temp = slow; //slow has to move till the fast to check the length of a LL
                int length = 0;
                do{
                    temp = temp.next;
                    length ++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    //Linked List Cycle ||
    public static ListNode detectCycle(ListNode head){
        int length = 0;
        ListNode fast = head; //it should start from begining
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next; //run 2 times faster
            slow = slow.next; //one time

            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        //Find the start
        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            s = s.next;
            length --;
        }
        //Keep move both forward, and they will meet at a cycle
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }
    //Happy Number using Slow and fast pointer
    public static boolean happyNumber(int n){
        int slow = n;
        int fast = n ;
        do {
            slow  = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);
        if(fast == 1){
            return true;
        }
        return false;
    }

    static int findSquare(int num){
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            ans  += rem * rem;
            num = num /10;
        }
        return ans;
    }

    //Finding the middle of the LL
    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null){
            s= s.next;
            f = f.next.next;
        }
        return s;
    }
    //Reversing the Linked List
    public ListNode reverseNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    //Reverse the Linked List ||
    public ListNode reverseInBetween(ListNode head,int left,int right){
        if(left == right){
            return head;
        }
        //skip the first left - 1 nodes
        ListNode current  = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev  = current;
            current = current.next;
        }

        ListNode last  = prev;
        ListNode newEnd = current;

        //reverse B/W left and right
        ListNode next = current.next;
        for (int i = 0; current !=null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
    //Hard problem
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);
        int count = length / k;
        while (count > 0) {
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;
    }
    //Reverse the alternate k-group
    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    //Check If LL is Palindrome or Not

    public boolean isPalindrome(ListNode head){
        ListNode mid = middleNode(head);//Finding middle of the LL
        ListNode headSecond = reverseNode(mid); //second half of the LL
        ListNode rereverse = headSecond; //temp variable to re-reverse the mid

        while (head != null && headSecond != null){
            if (head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseNode(rereverse);//Re-reverse to LL
        return head == null || headSecond == null;
    }
    //2nd solution for isPalindorme

    //public boolean isPalindrome(ListNode head) {
    //    ListNode fast = head, slow = head;
    //finding middle node
    //    while (fast != null && fast.next != null) {
    //        fast = fast.next.next;
    //        slow = slow.next;
    //    }
    //    if (fast != null) { // odd nodes: let right half smaller
    //        slow = slow.next;
    //    }
    //    slow = reverse(slow);
    //    fast = head;
    //
    //    while (slow != null) {
    //        if (fast.val != slow.val) {
    //            return false;
    //        }
    //        fast = fast.next;
    //        slow = slow.next;
    //    }
    //    return true;
    //}
    //
    //public ListNode reverse(ListNode head) {
    //    ListNode prev = null;
    //    while (head != null) {
    //        ListNode next = head.next;
    //        head.next = prev;
    //        prev = head;
    //        head = next;
    //    }
    //    return prev;
    //}

    //Reorder List
    public void reorderList(ListNode head){
        if(head != null && head.next != null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseNode(mid);
        ListNode hf = head;


        while (hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        //next of tail to null
        if(hf.next != null){
            head.next = null;
        }
    }
    //Rotate Right
    public ListNode rotateRight(ListNode head,int k){
        if(k <= 0 || head != null || head.next != null){
            return head;
        }
        ListNode last = head;
        int length = 1;

        while (last != null){
            last = last.next;
            length++;
        }
        last.next = head; //passing the last node to head

        int rotation = k % length; // How many times it has to rotate
        int skip = length - rotation;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next; //next of the new last node sent into head
        newLast.next = null;
        return head;
    }

    public static void main(String[] args) {
        Interview_LL list = new Interview_LL();
        System.out.println(happyNumber(12));
    }
    class ListNode {
        int val;

        public ListNode() {
        }

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
