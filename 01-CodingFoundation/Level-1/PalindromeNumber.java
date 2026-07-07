// Leetcode 9 Link - https://leetcode.com/problems/palindrome-number/description/

import java.util.Scanner;
public class PalindromeNumber {
    public static boolean isPlaindrome(int x){
        int num = x;
        int newNum = 0;
        while(num != 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        if(newNum == x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println(isPlaindrome(x));
       sc.close(); 
    }
}
