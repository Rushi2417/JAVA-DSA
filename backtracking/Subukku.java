public class Subukku {
    public static boolean issafe(int suduku[][], int row, int col, int digit){
        for(int i=0; i<9; i++){
            if(suduku[i][col]==digit){
                return false;
            }
        }
        for(int j=0; j<9; j++){
            if(suduku[row][j]==digit){
                return false;
            }
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(suduku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudukuSolver(int suduku[][], int row, int col){
        if(row==9){
            return true;
        }
        int newRow=row, newCol=col+1;
        if(col+1==9){
            newRow=row+1;
            newCol=0;
        }
        if(suduku[row][col]!=0){
            return sudukuSolver(suduku, newRow, newCol);
        }
        for(int digit=1; digit<=9; digit++){
            if(issafe(suduku, row, col, digit)){
                suduku[row][col] = digit;
                if(sudukuSolver(suduku, newRow, newCol)){
                    return true;
                }
                suduku[row][col]=0;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        int suduku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if(sudukuSolver(suduku, 0, 0)){
            System.out.println("true");
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    System.out.print(suduku[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("false");
        }
    }
}
