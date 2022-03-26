package question3;

public class main {
    public static void main(String[] args) {
        PsychiatristObject p1 = new PsychiatristObject();
        moodyObject m1 = new HappyObject();
        moodyObject m2 = new SadObject();
        p1.examine(m1);
        m1.getMood();
        m1.ExpressFeelings();
        m1.toString();
        p1.examine(m2);
        m2.getMood();
        m2.ExpressFeelings();
        m2.toString();
        
    }
}

