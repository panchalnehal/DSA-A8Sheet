import java.util.*;
public class InvertedFullPyramid {
    public static void invertedFullPyramid(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 0;j < (2*(num-i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        invertedFullPyramid(x);
        sc.close();

    }
}
