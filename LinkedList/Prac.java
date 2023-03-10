public class Prac{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void add(int idx, int data){
        Node newNode = new Node(data);
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public static int removeFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public static int removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static Node findMid(){
        Node slow = head;
        Node fast = head;
        while(fast==null || fast.next==null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static boolean palindrom(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode = findMid();

        Node prev = null;
        Node cur = midNode;
        Node next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        Node right = prev;
        Node left = head;

        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    

    public static void main(String args[]){
        Prac ll = new Prac();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.palindrom());
        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.itretive(3));
        // System.out.println(ll.recItretive(5));
        // ll.reverseLL();
        // ll.print();
    }
}