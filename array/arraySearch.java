import java.util.*;
public class arraySearch {
    //Linear Search
    public static void linearSearch(int arr[], int key, int n){
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    //Binary Search in sorted array
    public static void binarySearch(int arr[], int key, int n){
        int s=0, e=n-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == key){
                System.out.println("Key found at index "+ mid);
                return;
            } else if(arr[mid]>key){
                s = mid+1;
            } else{
                e = mid-1;
            }
        }
        System.out.println("Key not found");
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in array : ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        for(int i=0; i<n; i++){
            System.out.print("Enter arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to serach : ");
        int key = sc.nextInt();
        // linearSearch(arr, key, n);
        binarySearch(arr, key, n);
    }
}
