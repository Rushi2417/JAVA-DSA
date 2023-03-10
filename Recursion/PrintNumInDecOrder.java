public class PrintNumInDecOrder {
    public static void dec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }

        System.out.println(n);
        dec(n-1);
    }
    public static void main(String args[]){
        int n=10;
        dec(n);
    }
}