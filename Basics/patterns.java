import java.util.*;

public class patterns {

    public static void starPattern(int n){                               // *
        for(int i = 1; i<=n; i++){                                       // **
            for(int j = 1; j<=i; j++){                                   // ***
                System.out.print("*");                                 // ****
            }
            System.out.println();
        }
    }


    public static void invertedStarPattern(int n){                        // ****
        for(int i=1; i<=n; i++){                                          // ***
            for(int j=1; j<=n-i+1; j++){                                  // **
                System.out.print("*");                                  // *
            }
            System.out.println();
        }
    }


    public static void halfPyramidPattren(int n){
        for(int i=1; i<=n; i++){                                       //1
            for(int j=1; j<=i; j++){                                   //12
                System.out.print(j);                                   //123
            }                                                          //1234
            System.out.println();
        }
    }


    public static void charpattern(int n){                           //A
        char ch = 'A';                                               //BC
        for(int i=1; i<=n; i++){                                     //DEF
            for(int j=1; j<=i; j++){                                 //GHIJ
                System.out.print(ch);
                ch++;
            }
            System.out.println();;
        }
    }

    public static void hollowRectangle(int n){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();                                                           //no of colums
        for(int i = 1; i<=n; i++){                                   // *****
            for(int j = 1; j<=m; j++){                               // *   *
                if(i==1 || j==1 || i==n || j==m){                    // *   *
                    System.out.print("*");                        // *****
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void invertedAndRotated(int n){                     //     *
        for(int i=1; i<=n; i++){                                      //    **
            for(int j=1; j<=n-i; j++){                                //   ***
                System.out.print(" ");                             //   ****
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inveredHalfPyramid(int n){                   // 12345
        for(int i = 1; i<=n; i++){                                  // 1234
            for(int j=1; j<=n-i+1; j++){                            // 123
                System.out.print(j);                                // 12
            }                                                       // 1
            System.out.println();
        }
    }
    

    public static void FloydsTriangle(int n){                      // 1
        int counter=1;                                             // 2 3
        for(int i=1; i<=n; i++){                                   // 4 5 6
            for(int j=1; j<=i; j++){                               // 7 8 9 10
                System.out.print(counter+" ");                  
                counter++;
            }
            System.out.println();
        }
    }



    public static void zeroOneTriange(int n){                    // 1
        for(int i=1; i<=n; i++){                                 // 01
            for(int j=1; j<=i; j++){                             // 101
                if((i+j)%2 == 0){                                // 0101
                    System.out.print(1);                      // 10101
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");                     //
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){                   //    *****
                System.out.print(" ");                //   *****
            }                                           //   *****
            for(int j=1; j<=n; j++){                    // *****
                System.out.print("*");               //*****
            }
            System.out.println();
        }
    }




    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || j ==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



    public static void dimaond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void numberPyramid(int n){               //       1
        for(int i=1; i<=n; i++){                           //      2 2
            for(int j=1; j<=n-i; j++){                     //     3 3 3
                System.out.print(" ");                  //     4 4 4 4
            }                                             //    5 5 5 5 5
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    public static void palindromic(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }                                          //         1
            for(int j=i; j>=1; j--){                   //        212
                System.out.print(j);                   //       32123
            }                                          //      4321234
            for(int j=2; j<=i; j++){                   //     543212345
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                                              //number of rows
        //starPattern(n);
        //invertedStarPattern(n);                              
        //halfPyramidPattren(n);
        //charpattern(n); 
        // hollowRectangle(n);           
        //invertedAndRotated(n); 
        // inveredHalfPyramid(n); 
        //FloydsTriangle(n);    
        //zeroOneTriange(n);     
        //butterfly(n);    
        // solidRhombus(n);      
        // hollowRhombus(n);
        dimaond(n);
        // numberPyramid(n);
        // palindromic(n);
    }
}
