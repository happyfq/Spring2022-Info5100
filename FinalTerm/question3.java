package FinalTerm;
import java.util.HashSet;
import java.util.Set;

public class question3 {
    public int lengthOfLongestSubstring(String s){
        if (s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int sum = 1;
        while (r < s.length()) {
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