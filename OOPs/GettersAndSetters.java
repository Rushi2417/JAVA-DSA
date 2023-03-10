public class GettersAndSetters {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setColor("red");;
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private float tip;

    String getColor(){
        return this.color;
    }

    float getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(float newTip){
        this.tip = newTip;
    }
}
