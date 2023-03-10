import java.util.ArrayList;

public class StackPrac{
    static ArrayList<Integer> list = new ArrayList<>();

    boolean isEmpty(){
        return list.size() == 0;
    }

    void push(int data){
        list.add(data);
        return;
    }

    int pop(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int val = list.get(list.size()-1);
        list.remove(list.size()-1);
        return val;
    }

    int peek(){
        return list.get(list.size()-1);
    }

    public static void main(String args[]){
        StackPrac s = new StackPrac();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}