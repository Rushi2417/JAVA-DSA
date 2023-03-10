import java.util.ArrayList;

public class Basics {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(4);
        list.add(1);
        list.add(10);

        list.add(2, 8);

        System.out.println(list);

        System.out.println(list.get(0));


        list.remove(0);
        System.out.println(list);

        list.set(2, 6);
        System.out.println(list);

        System.out.println(list.contains(10));
    }
}