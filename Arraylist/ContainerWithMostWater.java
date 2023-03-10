import java.util.ArrayList;

public class ContainerWithMostWater {
    // //Brute Force O(n^2)
    // public static int stored(ArrayList<Integer> list){
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             int height = Math.min(list.get(i), list.get(j));
    //             int width = Math.abs(j-i);
    //             int cur = height*width;
    //             max = Math.max(max, cur);

    //         }
    //     }
    //     return max;
    // }

    // 2 Pointers

    public static int stored(ArrayList<Integer> list){
        // int max=Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         int width = j-1;
        //         int height = Math.min(list.get(i), list.get(j));
        //         int curmax = height*width;
        //         max=Math.max(max, curmax);
        //     }
        // }
        // return max;
        
        int si=0, ei=list.size()-1;
        int max=Integer.MIN_VALUE;
        while(si<ei){
            int height = Math.min(list.get(si), list.get(ei));
            int width = ei-si;
            int curMax = height*width;
            max = Math.max(curMax, max);
            if(list.get(si)<list.get(ei)){
                si++;
            }else{
                ei--;
            }
        }
        return max;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(stored(list));
    }
}
