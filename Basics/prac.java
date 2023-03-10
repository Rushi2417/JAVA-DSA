public class prac {
    public static void main(String args[]){
       int dec = 5, bin=0, pow=0;
       while(dec>0){
        int rem=dec%2;
        bin=bin+ rem*(int)Math.pow(10, pow);
        pow++;
        dec/=2;
       }
       System.out.println(bin);
    }   
}
