public class question1 {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(new Solution1().isPalindrome(s));
    }
}
class Solution1 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.toLowerCase().charAt(l) != s.toLowerCase().charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}