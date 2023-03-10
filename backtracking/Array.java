public class Array{
    public static void changeArr(int arr1[], int i, int val){
        if(i==arr1.length){
            printarr(arr1);
            return;
        }
        arr1[i] = val;
        changeArr(arr1, i+1, val+1);
        arr1[i] = arr1[i]-2;
    }

    public static void printarr(int arr1[]){
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
    public static void main(String arr[]){
        int arr1[] = new int[5];
        changeArr(arr1,0,1);
        printarr(arr1);
    }
}