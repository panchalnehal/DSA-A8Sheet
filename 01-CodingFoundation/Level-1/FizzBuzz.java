// LeetCode 412 Link - https://leetcode.com/problems/fizz-buzz/description/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n){
        List<String> ans = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            }else if(i%3 == 0){
                ans.add("Fizz");
            }else if(i%5 == 0){
                ans.add("Buzz");
            }else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
    public static void printList(List<String> list){
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        List<String> result = fizzBuzz(15);
        printList(result);
    }
}
