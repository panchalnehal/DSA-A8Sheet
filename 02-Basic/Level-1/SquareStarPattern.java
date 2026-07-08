import java.util.Scanner;

public class SquareStarPattern{
    public static void squarePattern(int num){
        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        squarePattern(num);
        sc.close();
    }
}
