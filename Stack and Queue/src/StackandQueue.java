import java.util.*;

public class StackandQueue
{
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(90);
//        stack.push(78);
//        stack.push(6);
//        stack.push(5);
//        stack.add(1);
//        System.out.println(stack);
//        System.out.println(stack.pop());
        //Queue
//        Queue<Integer> queue = new LinkedList<>();//interface
//        queue.add(131);
//        queue.add(11);
//        queue.add(13);
//        queue.add(1);
//        System.out.println(queue);
//        System.out.println(queue.remove());
        //Deque
        Deque<Integer> deque = new ArrayDeque<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        LinkedList<Integer> list1= new LinkedList<>();
//        list1.addFirst(5);
        deque.add(10);
        deque.addLast(19);
        deque.addFirst(89);
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);

    }
}
