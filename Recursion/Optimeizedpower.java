public class Optimeizedpower {
    public static int power(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpower = power(a, n/2);
        int halfpower2 = halfpower * halfpower;
        if(n%2 != 0){
            halfpower2 = a*halfpower2;
        }
        return halfpower2;
    }
    public static void main(String args[]){
        int a=2;
        int n=10;
        System.out.println(power(a,n));
    }
}
