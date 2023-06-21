package lectureNotes._L17_OOPS_;

public class methodOverriding {
    public static void main(String[] args) {
        DerivedClass dClass = new DerivedClass();
        dClass.fun1();
    }
}
class BaseClass{
    int num1=1;
    void fun1(){
        System.out.println("This Is Function of Base Class " + num1 );
    }
}
class DerivedClass extends BaseClass{
    int num2=2;
    void fun1(){
        System.out.println("This Is Function of Derived Class " + num2 );
    }
}