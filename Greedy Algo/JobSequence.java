import java.util.Arrays;
import java.util.Comparator;

public class JobSequence {
    public static void main(String args[]){
        int job[][] = {{4,20},{1,10},{1,40},{1,30}};
        Arrays.sort(job, Comparator.comparingDouble(o -> o[0]));
        int maxProfit=0;
        int totalmax=0;

        for(int i=0; i<job.length; i++){
            while(job[i][0]==job[i+1][0]){
                maxProfit = Math.max(maxProfit, job[i][1]);
            }
            totalmax+=maxProfit;
        }
        System.out.println(totalmax);
    }
}
