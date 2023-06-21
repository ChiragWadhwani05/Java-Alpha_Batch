package lectureNotes._L17_OOPS_;

public class abstraction {
    public static void main(String[] args) {
       // BaseClass class1 =new BaseClass(); It is not possible for abstract class.
        DerivedClass dClass = new DerivedClass();
        DerivedClass2nd dClass2 =new DerivedClass2nd();
        dClass.fun1();
        dClass2.fun1();
        
    }
}
abstract class BaseClass{
    BaseClass(){
        System.out.println("Base Class Constructor.");
    }
   abstract void fun1();
}
class DerivedClass extends BaseClass{
    
    DerivedClass(){
        System.out.println("Derived Class Constructor");
    }
    void fun1(){
        System.out.println("This is necessary method for this class as it abstract");
    }
}
class DerivedClass2nd extends BaseClass{
    DerivedClass2nd(){
        System.out.println("Derived Class 2nd Constructor");
    }
    void fun1(){
        System.out.println("And It can be different for every derived class ");
    }
    
}