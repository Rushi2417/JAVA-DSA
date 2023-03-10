public class Constructor {
    public static void main(String args[]){
        // Student s1 = new Student();                         // Unparameterized constructor
        // Student s2 = new Student("Rushikesh");        //parameterized constructor
        // Student s3 = new Student(1234);
    }
}

class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructor is called...");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
