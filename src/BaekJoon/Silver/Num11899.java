package BaekJoon.Silver;

import java.util.Scanner;
import java.util.Stack;

public class Num11899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arrstr[] = str.split("");

        Stack<String> stack = new Stack<String>();
        int cnt=0;
        for (String arr : arrstr) {
            if(arr.equals("(")){
                stack.push(arr);
            }
            else{
                if(stack.empty()){
                   cnt++;
                }
                else{
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()){
            stack.pop();
            cnt++;
        }
        System.out.println(cnt);
    }
}
