// Leetcode 326 Link - https://leetcode.com/problems/power-of-three/

import java.util.Scanner;
public class PowerOfThree {
    public static boolean isPowerOfThree(int n){
        if(n <= 0) return false;
        while(n % 3 == 0){
            n = n/3;
        }
        return n == 1;      // checks whether the final value is actually 1             
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPowerOfThree(num));
        sc.close();
    }
}
