public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String cleaned = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned = cleaned + ch;
            }
        }

        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }
        return cleaned.equals(reversed);   
    
    }
}
