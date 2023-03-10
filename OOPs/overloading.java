public class overloading {
    public static void main(String args[]){
        Calculator cal = new Calculator();
        System.out.println(cal.add(5,6));
        System.out.println(cal.add(4.2f, 6.5f));
        System.out.println(cal.add(5,6,8));
    }
}


class Calculator{
    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}
