class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> s = new Stack<>();
        long nextGreater[] = new long[n];
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return nextGreater;
    } 
}
