package BaekJoon.Silver;

import java.util.Scanner;
import java.util.Stack;

public class Num4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.nextLine();
            if(str.equals(".")) break;
            String arrstr[] = str.split("");
            Stack<String> stack = new Stack<String>();
            for (String arr : arrstr) {
                if (arr.equals("(") || arr.equals("[")) {
                    stack.push(arr);
                } else {
                    if (arr.equals("]") || arr.equals(")")){
                        if (stack.empty() || (stack.peek().equals("(") && arr.equals("]")  || (stack.peek().equals("[") && arr.equals(")") ))) {
                            stack.push(arr);
                            break;
                        } else if ((stack.peek().equals("(") && arr.equals(")")) || (stack.peek().equals("[") && arr.equals("]"))) {
                            stack.pop();
                        }
                    }
                }
            }
            if (stack.empty()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
