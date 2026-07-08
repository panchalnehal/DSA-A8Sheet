import java.util.Scanner;

public class LeftHalfPyramid {
    public static void leftHalfPyramid(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j< num-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        leftHalfPyramid(num);
        sc.close();
    }
}
