public class PowerIs2OrNot {
    public static void main(String args[]){
        int n = 20;
        int m = n-1;
        if((n & m) == 0){
            System.out.println("Power of 2");
        } else{
            System.out.println("not po");
        }
    }
}
