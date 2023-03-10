public class DigonalSum {


    // Time complexity O(n^2)
    // public static void brouteForce(int matrix[][]){
    //     int sum=0;
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             if(i==j){
    //                 sum = sum + matrix[i][j];
    //             } else if(i+j == matrix.length-1){
    //                 sum = sum + matrix[i][j];
    //             }
    //         }
    //     }
    //     System.out.println(sum);
    // }



    // Time complexity O(n)
    public static void digonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            sum = sum + matrix[i][i];
            if(i!=matrix.length-i-1){
                sum=sum+matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // brouteForce(matrix);
        digonalSum(matrix);
    }
}
