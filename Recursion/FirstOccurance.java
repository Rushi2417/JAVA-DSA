public class FirstOccurance {
    public static int firstOcc(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,5,4,2,6,4,2,5,4};
        System.out.println(firstOcc(arr, 5, 0));
    }
}