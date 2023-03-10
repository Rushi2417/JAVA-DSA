import java.util.*;
public class StringBasics{
    public static void main(String args[]){
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("abcd");

        // //input
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);
        // String name2 = sc.nextLine();
        // System.out.println(name2);


        // //Length
        // String fullname = "Rushikesh Bhosale";
        // System.out.println(fullname.length());

        // //Concatenation
        String firstName = "Rushikesh";
        String LastName = "Bhosale";
        String fullname = firstName + " " + LastName;
        // System.out.println(fullname);

        // //charAt function
        // System.out.println(fullname.charAt(0));

        for(int i= 0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i)+" ");
        }
        System.out.println();
    }
}