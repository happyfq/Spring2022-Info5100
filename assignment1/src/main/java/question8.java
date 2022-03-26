public class question8 {
    public static void main(String[] args) {
        int scores = 78;
        Solution8 s = new Solution8();
        s.grade(scores);
    }
}
class Solution8{
    public void grade(int scores){
        if(scores > 90){
            System.out.println("Your score is Excellent");
        }else if(scores>80){
            System.out.println("Your score is Good");
        }else if(scores>70){
            System.out.println("Your score is Average");
        }else if(scores>60){
            System.out.println("Your score is Deficient");
        }else{
            System.out.println("Your score is Failing");
        }
    }
}