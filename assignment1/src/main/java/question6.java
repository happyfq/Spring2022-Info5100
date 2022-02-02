public class question6 {
    public static void main(String[] args) {
        int n = 300;
        Solution6 s = new Solution6();
        s.bill(n);
    }
}
class Solution6 {
    public void bill(int n) {
        double finalBill = 0;
        switch (n / 100) {
            case 0:
                System.out.println("Your bill is 200 dollars");
                break;
            case 1:
                if (n > 150 && n<=200) {
                    finalBill = 200 + 50 * 0.6 + (n - 150) * 0.5;
                    System.out.println("Your bill is " + finalBill + " dollars");
                } else {
                    finalBill = 200 + (n - 100) * 0.6;
                    System.out.println("Your bill is " + finalBill + " dollars");
                }
                break;
            default:
                finalBill = 200 + 50 * 0.5 + 50 * 0.6 + 0.4 * (n - 200);
                System.out.println("Your bill is " + finalBill + " dollars");
                break;
        }
    }
}