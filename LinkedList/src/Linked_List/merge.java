package Linked_List;

public class merge
{
    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
    public Interview_LL.ListNode middle(Interview_LL.ListNode head){
        Interview_LL.ListNode s = head;
        Interview_LL.ListNode f = head;
        while (f != null && f.next != null){
            s= s.next;
            f = f.next.next;
        }
        return s;
    }
    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    //2nd solution
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null)
//            return head;
//
//        // step 1. cut the list to two halves
//        ListNode prev = null, slow = head, fast = head;
//
//        while (fast != null && fast.next != null) {
//            prev = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        prev.next = null;
//
//        // step 2. sort each half
//        ListNode l1 = sortList(head);
//        ListNode l2 = sortList(slow);
//
//        // step 3. merge l1 and l2
//        return merge(l1, l2);
//    }
//
//    ListNode merge(ListNode l1, ListNode l2) {
//        ListNode l = new ListNode(0), p = l;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                p.next = l1;
//                l1 = l1.next;
//            } else {
//                p.next = l2;
//                l2 = l2.next;
//            }
//            p = p.next;
//        }
//
//        if (l1 != null)
//            p.next = l1;
//
//        if (l2 != null)
//            p.next = l2;
//
//        return l.next;
//    }
}
