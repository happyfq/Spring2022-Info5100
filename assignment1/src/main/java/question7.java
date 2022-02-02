public class question7 {
    public static void main(String[] args) {
        String ransomNote ="aac"; String magazine = "aab";
        System.out.println(new Solution383().canConstruct(ransomNote,magazine));
    }
}
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] nums = new int[26];
        for(int i=0;i<magazine.length();i++){
            nums[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            nums[ransomNote.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(nums[i]< 0){
                return false;
            }
        }
        return true;
    }
}