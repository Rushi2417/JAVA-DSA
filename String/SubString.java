public class SubString {

    public static void subString(String str, int si, int ei){
        String newString = "";
        for(int i=si; i<ei; i++){
            newString+=str.charAt(i);
        }
        System.out.println(newString);
    }
    public static void main(String args[]){
        String str = "Hello World";
        subString(str, 0, 5);

        System.out.println(str.substring(0, 5));
    }
    
}
