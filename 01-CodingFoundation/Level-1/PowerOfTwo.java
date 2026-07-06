// Leetcode 231 Link - https://leetcode.com/problems/power-of-two/
import java.util.Scanner;
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while(n > 1){
            if(n % 2 != 0){
                return false;
            }
            n /= 2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPowerOfTwo(num));
        sc.close();
    }
}
