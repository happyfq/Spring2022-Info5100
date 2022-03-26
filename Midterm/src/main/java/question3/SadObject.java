package question3;

public class SadObject extends moodyObject {
    //returns string indicating sad
    public String getMood(){
        return "I feel Sad Today";
    }

    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    @Override
    void ExpressFeelings() {
        System.out.println("waah’ ‘boo hoo’ ‘weep’ ‘sob");
    }

    //returns message about self : “Subject cries a lot”
    public String toString(){
       return "Subject cries a lot";
    }
}
