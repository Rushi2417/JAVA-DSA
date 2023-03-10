public class PrintSumOfNNumbers {
    public static int sumofn(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int fnm1 = sumofn(n-1);
        int fnm2 = sumofn(n-2);
        return fnm1+fnm2;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sumofn(n));
    }
}
