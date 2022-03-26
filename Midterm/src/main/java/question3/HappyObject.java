package question3;

public class HappyObject extends moodyObject {
    String mood;
    //returns string indicating happy
    public String getMood(){
        return "I feel Happy Today";
    }

    //print laughter string “heeehee....hahahah...HAHAHA!!”
    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return "Subject laughs a lot";
    }
}
