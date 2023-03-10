public class prac {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int r=0, c=matrix.length-1;
        int key = 16;
        while(r<=matrix.length-1 && c>=0){
            if(matrix[r][c]==key){
                System.out.println("key found at index + "+r+" "+c);
                return;
            }else if(matrix[r][c]<key){
                r++;
            }else{
                c--;
            }
        }
    }
}