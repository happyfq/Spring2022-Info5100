package question3;

public class PsychiatristObject {
    //asks moody object about its mood
    public void examine(moodyObject moodyObject) {
        moodyObject.queryMood();
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(moodyObject moodyObject) {
        moodyObject.getMood();
    }

    //returns message about self: “Subject laughs a lot”
    public String toString(String mood) {
        return "Subject laughs a lot";
    }
}
