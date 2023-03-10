public class Factorial {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int fac=n*fact(n-1);
        return fac;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(fact(n));
    }
}
