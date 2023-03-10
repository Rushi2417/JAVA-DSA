public class FindPermutation {
    public static void permutation(String str, String newStr){
        if(str.length()==0){
            System.out.println(newStr);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char cur = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            permutation(newString, newStr+str.charAt(i));
        }
    }
    public static void main(String args[]){
        String str ="abc";
        permutation(str, "");
    }
}
