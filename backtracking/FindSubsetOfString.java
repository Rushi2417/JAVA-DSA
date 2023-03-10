public class FindSubsetOfString {
    public static void subsets(String str,String newstr, int i){
        if(i==str.length()){
            if(newstr.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(newstr);
            }
            return;
        }
        subsets(str, newstr+str.charAt(i), i+1);
        subsets(str, newstr, i+1);
    }
    public static void main(String args[]){
        String str="abc";
        subsets(str,"",0);
    }
}
