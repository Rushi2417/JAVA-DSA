public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(head==tail){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }else if(head==tail){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail.prev = null;
        tail = temp;
        size--;
        return val;
    }

    public void reverse(){
        Node prev = null;
        Node cur = head;
        Node next;

        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            cur.prev = next;
            prev = cur;
            cur = next;
        }

        head = prev;
    }

    public static void main(String args[]){
        DoublyLL dll = new DoublyLL();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        System.out.println(dll.size);
        dll.print();
        dll.removeLast();
        dll.print();
        dll.reverse();
        dll.print();
    }
}
