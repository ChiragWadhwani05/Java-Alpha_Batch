package lectureNotes._L7_ConditionalStatements;

public class ternaryoperator {
    public static void main(String[] args) {
        // Ternary operator is another way of if else statements
       int number = 6;
       String type= ((number%2 )==0)? "EVEN":"ODD";
       System.out.println(type); 
    }
}
