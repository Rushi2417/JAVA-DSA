public class evenoroddbinary {
    public static void main(String args[]){
        int n = 10100;
        int bitMask = 1;
        if((n&bitMask) == 1){
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
