package lectureNotes._L17_OOPS_;

public class cunstrocters {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="JaiShreeRam";
        Student s2 = new Student(s1);
    //   s2.name="abcd";
        System.out.println(s2.name);
    }
}

class Student {

    String name;

    Student(){
        System.out.println("Parameterized Constructor!!");
    }
    //None Parameterized Constructor
    Student(String name){
        this.name=name;
    }
    //Copy Constructors
    Student(Student s1){
        this.name=s1.name;
    }
}