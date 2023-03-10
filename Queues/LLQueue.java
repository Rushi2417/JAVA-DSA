public class LLQueue {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{
        public static Node head;
        public static Node tail;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }
            int temp = head.data;
            //remove last
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return temp;
        }

        public static int peak(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(2);
        q.add(3);
        q.add(8);
        while(!q.isEmpty()){
            System.out.println(q.peak());
            q.remove();
        }
    }
}
