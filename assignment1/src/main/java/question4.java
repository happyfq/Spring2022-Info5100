public class question4 {
    public static void main(String[] args) {
        String s = "hehe";
        String t = "hhee";
        System.out.println(new Solution4().isAnagram(s,t));
    }
}

class Solution4 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] nums = new int[26];
        for(int i =0;i<s.length();i++){
            nums[s.charAt(i) - 'a']++;
        }
        for(int j =0;j<t.length();j++){
            nums[t.charAt(j) - 'a']--;
        }
        for(int n =0;n<26;n++){
            if(nums[n]!=0){
                return false;
            }
        }
        return true;
    }
}