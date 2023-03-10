import java.util.*;

public class IndiansCoins {
    public static void main(String args[]){
        int v =590;
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        
        // Arrays.sort(coins, Collections.reverseOrder());
        int countOfcoins =0;
        ArrayList< Integer> list = new ArrayList<>();

        for(int i=coins.length-1; i>=0; i--){
            if(coins[i]<=v){
                while(coins[i]<=v){
                    v-=coins[i];
                    countOfcoins++;
                    list.add(coins[i]);
                }
            }
        }

        System.out.println(countOfcoins);
        System.out.println(list);
    }
}
