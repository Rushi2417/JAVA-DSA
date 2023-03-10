import java.util.Scanner;

public class functions {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            int sum = 1;
            for(int i=1; i<=n; i++){
                sum *= i;
            }
            return sum;
        }
    }

    public static int binoCoeff(int n){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int num = fact(n)/(fact(r)*fact(n-r));
        return num;
    }

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


    public static void primeInRange(int n){
        for(int i = 2; i<=n; i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }


    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }


    public static void palindrom(int n){
        int m = n;
        int rev = 0;
        while(n>0){
            int ld = n%10;
            rev = rev * 10 + ld;
            n/=10;
        }
        if(m==rev){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(fact(n));
        // System.out.println(binoCoeff(n));
        // System.out.println(isprime(n));
        // primeInRange(n);
        // System.out.println(isEven(n));
        palindrom(n);
    }
}
