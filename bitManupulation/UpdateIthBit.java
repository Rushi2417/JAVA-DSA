public class UpdateIthBit {
    public static void main(String args[]){
        int n = 10, i = 2, newBit = 1;
        int bitMask;
        if(newBit == 0){
            bitMask = ~(1<<i);
            System.out.println(n&bitMask);
        } else {
            bitMask = 1<<i;
            System.out.println(n|bitMask);
        }
    }
}
