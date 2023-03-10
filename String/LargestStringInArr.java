public class LargestStringInArr {
    public static void main(String srgs[]){
        String fruits[] = {"apple", "bananna", "mango"};
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
