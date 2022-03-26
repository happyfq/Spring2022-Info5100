import java.util.HashSet;
import java.util.Set;

public class question6 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(new Solution6().findLongest(s));
    }
}

class Solution6 {
    public int findLongest(String s) {
        int n = s.length();
        if (n <= 1) return n;
        int l = 0;
        int r = 0;
        int sum = 0;
        Set<Character> set = new HashSet<>();
        while (r < n) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            sum = Math.max(sum, r - l + 1);
            set.add(s.charAt(r));
            r++;
        }
        return sum;
    }
}
