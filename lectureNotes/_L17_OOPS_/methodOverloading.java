package lectureNotes._L17_OOPS_;

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 4));
        System.out.println(calc.sum((float)5.3,(float)4.7));
        System.out.println(calc.sum(5, 4,1));

    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    Float sum(float a, Float b){
        return a+b;
    }
    int sum(int a, int b , int c){
        return a+b+c;
    }
}