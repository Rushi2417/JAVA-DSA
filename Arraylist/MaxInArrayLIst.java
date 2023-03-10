import java.util.ArrayList;

public class MaxInArrayLIst {
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(7);

        for(int i=0; i<list.size(); i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }

        
        System.out.println(max);
    }
}
