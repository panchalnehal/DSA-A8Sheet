// Leetcode 69 link - https://leetcode.com/problems/sqrtx/

import java.util.Scanner;

public class Sqrt {
    public static int mySqrt(int x){
        return (int) Math.sqrt(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(mySqrt(num));
        sc.close();
    }
}
