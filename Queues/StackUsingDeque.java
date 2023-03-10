import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack{
        static Deque<Integer> deque = new LinkedList<>();

        public static void push(int data){
            deque.addLast(data);
        }

        public static int pop(){
            return deque.removeLast();
        }

        public static int peek(){
            return deque.getLast();
        }
    }

    static class Queue{
        static Deque<Integer> deque = new LinkedList<>();

        public static void add(int data){
            deque.addLast(data);
        }

        public static int remove(){
            return deque.removeFirst();
        }

        public static int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String args[]){
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());


        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
