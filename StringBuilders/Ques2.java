public class Ques2 {
    public static StringBuilder Compress(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            Integer count = 1 ;
            sb = sb.append(s.charAt(i));
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                sb = sb.append(count.toString());
            }
        }
        return sb;
    }
    public static void main(String args[]){
        String s = "aaabbbc";
        System.out.println(Compress(s));
    }
}
