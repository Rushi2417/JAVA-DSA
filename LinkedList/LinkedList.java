public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
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
        tail=newNode;
    }

    public void printll(){
        Node temp = head;
        if(head==null){
            System.out.print("LL is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("->null");
    }

    public void add(int idx, int data){
        Node newNode = new Node(data);
        if(idx==0){
            addFirst(data);
            size++;
            return;
        }
        size++;
        Node prev = head;
        int i=0;
        while(i<idx-1){
            prev = prev.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(head==tail){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(head==null){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }else if(head==tail){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        Node prev = head;
        int i=0;
        while(i<size-2){
            prev = prev.next;
            i++;
        }
        prev.next = null;
        size--;
        tail=prev;
        return val;
    }

    public int itrSerach(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }


    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void deleteFromLast(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        if(n==sz){
            head=head.next;
            return;
        }

        int iToFind = sz-n;
        Node prev=head;
        int i=1;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //findmid
        Node midNode = findMid(head);
        //reverse second half
        Node prev=null;
        Node cur=midNode;
        while(cur!=null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        Node right = prev;
        Node left = head;
        //check
        while(right!=null){
            if(right.data != left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;

    }

    public static boolean detectCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
            
        }
        return false;
    }

    public static void removeCycle(){
        //cycle detect
        Node slow=head;
        Node fast=head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //changes
        Node prev=null;
        slow=head;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }


    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    // private void merge(Node head1, Node head2){
        
    // }

    // public Node mergeSort(Node head){
    //     //mid
    //     Node mid = getMid(head);
    //     //Left and right and mergeSOrt
    //     Node righthead = mid.next;
    //     mid.next = null;
    //     Node newLeft = mergeSort(head.next);
    //     Node newRight = mergeSort(righthead.next);
    //     //merge
    //     return merge(newLeft, newRight);
    // }

    public void zigZag(){
        //get mid
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;

        //reverse 2nd half
        Node cur = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printll();
        ll.zigZag();
        ll.printll();
    }
}