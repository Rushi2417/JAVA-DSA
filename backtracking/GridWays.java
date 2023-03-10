public class GridWays {
    public static int grid(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            return 1;
        }else if(i==m || j==n){
            return 0;
        }
        return grid(i+1, j, m, n)+grid(i, j+1, m, n);
    }
    public static void main(String args[]){
        int m=3, n=3;
        int arr[][] = new int[m][n];
        System.out.println(grid(0, 0, m, n));
    }
}
