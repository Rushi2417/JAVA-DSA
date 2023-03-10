public class XToPowerOne {
    public static int expo(int x, int a){
        if(a==1){
            return x;
        }
        int xam1 = x * expo(x, a-1);
        return xam1;
    }
    public static void main(String args[]){
        System.out.println(expo(2, 10));
    }
}
