import java.util.*;
public class JavaBasics {
    
    // // find area of circle
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     float r = sc.nextFloat();
    //     float area = 3.14f * r * r;
    //     System.out.println(area);
    // }



    // // find largest of two numbers
        // public static void main(String args[]){
        //     int a = 5, b = 6;
        //     if(a>b){
        //         System.out.println(a);
        //     } else{
        //         System.out.println(b);
        //     }
        // }



    //  //print num is odd or even
    // public static void main(String args[]){
    //     int a = 5;
    //     if(a%2==0){
    //         System.out.println("Even");
    //     } else{
    //         System.out.println("Odd");
    //     }
    // }



    //  //print largest of three number
    // public static void main(String args[]){
    //     int a = 20, b = 15, c = 10;
    //     if(a>b && a>c){
    //         System.out.println(a);
    //     } else if(b>c){
    //         System.out.println(b);
    //     } else{
    //         System.out.println(c);
    //     }
    // }



    //  //check student is pass or fail
    // public static void main(String args[]){
    //     int marks = 32;
    //     System.out.println(marks>36 ? "Pass" : "Fail");
    // }


    // //Calculator
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     char oprator = sc.next().charAt(0);

    //     switch(oprator){
    //         case '+' : System.out.println(a+b);
    //                     break;
    //         case '-' : System.out.println(a-b);
    //                     break;
    //         case '*' : System.out.println(a*b);
    //                     break;
    //         case '/' : System.out.println(a/b);
    //                     break;
    //         case '%' : System.out.println(a%b);
    //                     break;
    //         default : System.out.println("You entered wrong oprator");
    //     }
    // }


    //  //Leap year or not
    // public static void main(String args[]){
    //     int a = 300;
    //     if((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
    //         System.out.println("LeapYear");
    //     }
    //     else{
    //         System.out.println("NotLeapYear");
    //     }
    // }




    //  //Sum of first n natural numbers
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int sum = 0;
    //     for(int i = 1; i <= a; i++){
    //         sum += i;
    //     }
    //     System.out.println(sum);
    // }


    // //print reverse of number
    // public static void main(String args[]){
    //     int n = 1234, rev=0;
    //     while(n>0){
    //         int ld = n%10;
    //         rev = rev*10 + ld;
    //         n/=10;
    //     }
    //     System.out.println(rev);
    // }


    //  //keep entering number till user enters a multiple of 10
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     do{
    //         int n = sc.nextInt();
    //         if(n%10 == 0){
    //             break;
    //         }
    //     } while(true);
    // }


    //  //Display all numbers entered by user accept multiple of 10
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     do{
    //         int n = sc.nextInt();
    //         if(n%10 == 0){
    //             continue;
    //         }
    //         System.out.println(n);
    //     } while(true);
    // }


    //  //Prime or not
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     if(n == 2){
    //         System.out.println("Prime number");
    //     }
    //     else{
    //         boolean isprime = true;
    //         for(int i=2; i<=Math.sqrt(n); i++){
    //             if(n%i == 0){
    //                 isprime = false;
    //                 break;
    //             }
    //         }
    //         if(isprime == true){
    //         System.out.println("Prime number");
    //         }
    //         else{
    //             System.out.println("Not prime number");
    //         }
    //     }
    // }


    // //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int even=0, odd=0, option;
    //     do{
    //         int i = sc.nextInt();
    //         if(i%2 == 0){
    //             even+=i;
    //         }
    //         else{
    //             odd+=i;
    //         }
    //         System.out.println("Enter 1 to continue");
    //         option = sc.nextInt();
    //     }while(option == 1);
    //     System.out.println(even +"," +odd);
    // }


    //  //Write a program to find the factorial of any number entered by the user
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n =sc.nextInt();
    //     int sum = 1;
    //     if(n == 0){
    //         System.out.println(1);
    //     }
    //     else{
    //         for(int i = 1; i<=n; i++){
    //             sum*=i;
    //         }
    //         System.out.println(sum);
    //     }
    // }

    //  //Multiplication table enterd by user
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i =1; i<=10; i++){
    //         System.out.println(n + " * " + i + " = " + n*i);
    //     }
    // }

    //  //Number is palindrom or not
    // public static void main(String args[]){
    //     int n = 121;
    //     int m = n;
    //     int rev = 0;
    //     while(n>0){
    //         int ld = n%10;
    //         rev = rev * 10 + ld;
    //         n/=10;
    //     }
    //     if(rev == m){
    //         System.out.println("Palindrom");
    //     }
    //     else{
    //         System.out.println("Not Palindrom");
    //     }
    // }

    //armstong number
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =n, count=0;
        int k =n;
        while(m>0){
            m=m/10;
            count++;
        }
        int sum=0;
        while(n>0){
            int ld = n%10;
            sum = sum + (int)Math.pow(ld, count);
            n/=10;
        }
        System.out.println(k==sum ? "Armstrong": "Not Armstrong");
    }
}



//armstong number

