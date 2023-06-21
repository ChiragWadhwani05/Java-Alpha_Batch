package lectureNotes._L17_OOPS_;

public class interFace {
    public static void main(String[] args) {
        Class3 c3 = new Class3();
        c3.fun1();
        c3.fun2();
    }
}
interface Class1 {
    void fun1();
}
interface Class2{
    void fun2();
}
class Class3 implements Class1,Class2{
    
    public void fun1() {
       System.out.println("Inherited From Class 1");
            }
    public void fun2() {
       System.out.println("Inherited From Class 2");
            }
}