public class array {

    //Largest In array
    public static void largestInArray(int numbers[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }


    //Reverse Array
    public static void reverseArray(int numbers[]){
        int start = 0 , end = numbers.length-1;
        while(start<=end){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }


    //Print pairs in array
    public static void pairsInArray(int numbers[]){
        int tn = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
                tn++;
            }
            System.out.println();
        }
        System.out.println(tn);
    }

    //Printing subarrays
    public static void subarr(int numbers[]){
        int ts=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println(ts);
    }


    public static void main(String args[]){
        // int numbers[] = {1,-2,6,-1,3};
        // int key = 8;
        // System.out.println(linearSearch(numbers, key));
        // System.out.println(binarySearch(numbers, key));
        // largestInArray(numbers);
        // reverseArray(numbers);
        // pairsInArray(numbers);
        // subarr(numbers);
        // maxsubArr(numbers);
        // preMaxSubarr(numbers);
    }
}
