package BaekJoon.Gold;

import java.util.Scanner;
import java.util.Stack;

public class Num9935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            stack.push(str1.charAt(i));
        }
        while (!stack.isEmpty()){
            boolean chk = true;
            for(int i=0; i<str2.length(); i++){
                if(stack.peek() == str2.charAt(i)){
                    stack.pop();
                    chk=false;
                    break;
                }
            }
            if(chk){
                sb.append(stack.pop());
            }
        }
        System.out.println( sb.length() > 0 ? sb.reverse().toString() : "FRULA");

    }
}
