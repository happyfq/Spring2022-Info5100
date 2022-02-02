
public class question2 {
    public static void main(String[] args) {
        String s = "acn";
        System.out.println(new Solution2().isUnique(s));
    }
}
class Solution2 {
    public boolean isUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}