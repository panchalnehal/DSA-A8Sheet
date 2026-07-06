// Leetcode 1812 Link - https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/

import java.util.*;
public class ColorOfChessBoardSquare {
    public static boolean squareIsWhite(String coordinates){
        int column = coordinates.charAt(0);
        int row = coordinates.charAt(1);

        int col = column - 'a' + 1;             //Converts 'a'–'h' to 1–8 using 
        int r = row - '0';

        if((col + r)%2 == 0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinate = sc.nextLine();
        System.out.println(squareIsWhite(coordinate));
        sc.close();
    }
}
