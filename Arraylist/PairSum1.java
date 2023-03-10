import java.util.ArrayList;

public class PairSum1 {
    //  //Brute force
    // public static boolean findsum(ArrayList<Integer> list, int target){
    //     for(int i=0 ;i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //
    public static boolean findsum(ArrayList<Integer> list, int target){
        int si=0;
        int ei=list.size()-1;
        while(si<ei){
            if((list.get(si)+list.get(ei))==target){
                System.out.print(si+" "+ei);
                return true;
            }
            if((list.get(si)+list.get(ei))<target){
                si++;
            }else{
                ei--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target=9;
        System.out.println(findsum(list, target));
    }
}
