package lectureNotes._L17_OOPS_;

public class classes {
        public static void main(String[] args) {
            Pen p1 = new Pen();
            p1.setColor("black");
            p1.setTip(2);
            System.out.println(p1.color);
            
            System.out.println(p1.tip);

        }
}

class Pen{
    String color;
    int tip;
    void setColor(String str) {
        color = str;
    }
    void setTip(int size) {
        tip = size;
    }
}