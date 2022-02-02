public class question3 {
    public static void main(String[] args) {
        String s = "asa";
        System.out.println(new Solution3().idDuplicates(s));
    }
}
class Solution3 {
    public boolean idDuplicates(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}