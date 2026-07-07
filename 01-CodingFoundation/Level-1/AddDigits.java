// Leetcode 258 Link - https://leetcode.com/problems/add-digits/

import java.util.Scanner;
public class AddDigits {
    public static int addDigits(int num){
        while(num < 10){
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        return num;
        
        // if(num<10)return num;

        // int sum = 0;
        // while(num != 0){
        //     int digit = num% 10;
        //     sum = sum + digit;
        //     num = num/10;
        // }
        // return addDigits(sum);               // this is through recurison.
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(addDigits(number)); 
        sc.close();
    }
}
