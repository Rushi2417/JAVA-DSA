public class StringComparision{
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // if(s1==s2){
        //     System.out.println("strings are equal");
        // } else {
        //     System.out.println("strings are not equal");
        // }

        // if(s1==s3){
        //     System.out.println("strings are equal");
        // } else {
        //     System.out.println("strings are not equal");
        // }


        System.out.println(s1.equals(s3));
    }
}