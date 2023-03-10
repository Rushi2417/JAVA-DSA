//String is palindrom or not

public class PalindromOrNot {
    public static boolean isPalindrom(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("Not Palindrom");
                return false;
            }
        }
        System.out.println("Palindrom");
        return true;
    }

    public static void main(String args[]){
        String str = "racecar";
        isPalindrom(str);
    }
}
