public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int i = x;
        int num = 0;
        while(i != 0){
            int digit = i % 10;
            num = num * 10 + digit;
            i = i/10;
        }
        if(num >= 0 && num == x){
            return true;
        }else{
            return false;
        }
    }
}
