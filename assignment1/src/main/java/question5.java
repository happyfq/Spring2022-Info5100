public class question5 {
    public static void main(String[] args) {
        int n = 2000;
        System.out.println(new Solution5().isLeapYear(n));
    }
}
class Solution5 {
    public boolean isLeapYear(int n) {
        if (n % 100 == 0) {
            if (n % 400 == 0) {
                return true;
            }
            return false;
        } else {
            if (n % 4 == 0) {
                return true;
            }
        }
        return false;
    }
}