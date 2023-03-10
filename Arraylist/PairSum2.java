import java.util.ArrayList;

public class PairSum2 {
    public static boolean findsum(ArrayList<Integer> list, int target){
        int pivotPoint=-1;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                pivotPoint=i;
                break;
            }
        }

        int lp=pivotPoint+1;
        int rp=pivotPoint;
        int n=list.size();
        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==target){
                return true;
            }
            if((list.get(lp)+list.get(rp))<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=19;
        System.out.println(findsum(list, target));
    }
}
