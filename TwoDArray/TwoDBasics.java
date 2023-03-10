import java.util.*;;
public class TwoDBasics{


    //Searching in 2d Array
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at index ("+i+", "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;        
    }



    //Max in 2d Array
    public static int max(int matrix[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][i] > max){
                    max = matrix[i][j];
                }
            }
        } 
        return max;      
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // search(matrix, 5);
        System.out.println(max(matrix));
    }
}