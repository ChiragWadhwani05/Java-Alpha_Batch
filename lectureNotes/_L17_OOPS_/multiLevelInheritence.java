package lectureNotes._L17_OOPS_;

public class multiLevelInheritence {
    public static void main(String[] args) {
        DerivedClass2nd dClass=new DerivedClass2nd();
         dClass.fun1();
         dClass.fun2();
         dClass.fun3();
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
    void fun2(){
        System.out.println("This Is Function of Derived Class " + num2 );
    }
}
class DerivedClass2nd extends DerivedClass{
    int num3=3;
    void fun3(){
        System.out.println("This Is Function of Derived Class 2nd " + num3 );
    }
}