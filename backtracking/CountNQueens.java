public class CountNQueens {

    static int count=0;

    public static void printArray(char arr[][]){
        System.err.println("------------NewArray------------");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char arr[][], int row, int col){
        //upword
        for(int i=row-1; i>=0; i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }

        //dialeft
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }

        //diaright
        for(int i=row-1,j=col+1; i>=0 && j<arr.length; i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nqueens(char arr[][], int row){
        if(row==arr.length){
            count++;
            return;
        }
        for(int j=0; j<arr.length; j++){
            if(isSafe(arr, row, j)==true){
                arr[row][j] = 'Q';
                nqueens(arr, row+1);
                arr[row][j]='x';
            }
        }
    }
    public static void main(String args[]){
        int n=5;
        char arr[][] = new char[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = 'x';
            }
        }
        nqueens(arr, 0);
        System.out.println(count);
    }
}

