

class Pen{
    String color;
    float tip;

    void changeColor(String newColor){
        color = newColor;
    }

    void changeTip(float newTip){
        tip = newTip;
    }
}


public class ClassesAndObjects{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.color = "Blue";
        System.out.println(p1.color);
        p1.changeColor("red");
        System.out.println(p1.color);

        p1.tip = 0.5f;
        System.out.println(p1.tip);
    }
}