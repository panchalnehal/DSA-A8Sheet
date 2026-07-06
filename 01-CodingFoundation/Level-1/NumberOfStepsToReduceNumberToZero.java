// Leetcode 1342 Link - https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

import java.util.Scanner;
public class NumberOfStepsToReduceNumberToZero {
    public static int numberOfSteps(int num){
        int count = 0;
        while(num != 0){
            if(num % 2 == 1){
                num -= 1;
                count++;
            }else{
                num /= 2;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(numberOfSteps(number));
        sc.close();
    }
}
