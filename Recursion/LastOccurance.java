public class LastOccurance {
    public static String lastocc(String str){
        StringBuilder sb= new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            Integer count=1;
            while(i<str.length()-1 && ch==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(ch);
            sb.append(count.toString());
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(lastocc(str));
    }
}
