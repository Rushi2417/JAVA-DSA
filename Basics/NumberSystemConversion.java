import java.util.*;
public class NumberSystemConversion {

    public static int binToDec(int n){
        int dec = 0, pow = 0;
        while(n>0){
            int ld = n%10;
            dec = dec + (ld * (int)(Math.pow(2, pow)));
            n/=10;
            pow++;
        }
        return dec;
    }

    public static int decToBin(int n){
        int bin=0, pow=0;
        while(n>0){
            int rem = n%2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            n/=2;
            pow++;
        }
        return bin;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(binToDec(n));
        System.out.println(decToBin(n));
    }
}
