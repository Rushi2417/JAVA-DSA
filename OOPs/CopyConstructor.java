public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Rushi";
        s1.roll = 1234;

        Student s2 = new Student(s1);
        s2.password = 5678;
        System.out.println(s2.name);
    }
}

class Student{
    String name;
    int roll;
    int password;

    Student(Student s1){
        // this.name = name;
        // this.roll = roll;
    }

    Student(){
        System.out.println("constructor is called");
    }

    
}
