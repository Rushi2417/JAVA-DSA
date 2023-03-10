public class sumOfSubarray {
    public static void bruteforce(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int cur = 0;
                for(int k=i; k<=j; k++){
                    cur+=arr[k];
                }
                if(cur>max){
                    max=cur;
                }
            }
        }
        System.out.println(max);
    }

    public static void prefix(int arr[]){
        int max=Integer.MIN_VALUE;
        int cur = 0;
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pre[i] = pre[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            cur=0;
            for(int j=i; j<arr.length; j++){
                cur = (i==0) ? pre[j] : pre[j]-pre[i-1];
                if(max<cur){
                    max=cur;
                }
            }
            
            
        }
        System.out.println(max);
    }


    public static void kadanes(int arr[]){
        int max = Integer.MIN_VALUE;
        int cur=0;
        for(int i=0; i<arr.length; i++){
            cur = cur + arr[i];
            max = Math.max(max, cur);
            if(cur<0){
                cur=0;
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int arr[] ={-2,-3,-4,-1,-2,-1,-5,-3};
        bruteforce(arr);
        prefix(arr);
        kadanes(arr);
    }
}
