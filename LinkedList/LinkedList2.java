import java.util.LinkedList;
public class LinkedList2{
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.add(0, 0);
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
