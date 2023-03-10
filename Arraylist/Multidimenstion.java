import java.util.ArrayList;

public class Multidimenstion {
    public static void main(String args[]){
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(5);
        // list.add(9);
        // list.add(2);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(1);
        // list2.add(2);
        // list2.add(3);

        // mainList.add(list);
        // mainList.add(list2);

        // System.out.println(mainList);

        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> cur = mainList.get(i);
        //     for(int j=0; j<cur.size(); j++){
        //         System.out.print(cur.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list);
    }
}
