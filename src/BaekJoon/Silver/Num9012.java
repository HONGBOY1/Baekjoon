package BaekJoon.Silver;

import java.util.Scanner;
import java.util.Stack;

public class Num9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i < n; i++){
            String str = sc.next();
            String arrstr[] = str.split("");

            Stack<String> stack = new Stack<String>();

            for (String arr : arrstr) {
                if(arr.equals("(")){
                    stack.push(arr);
                }
                else{
                    if(stack.empty()){
                        stack.push(arr);
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.empty()) System.out.println("YES");
            else System.out.println("NO");

        }

/*
        for(int i=0; i<n; i++){
            String str = sc.next();
            String st[] = str.split("");
            int stk=-1;
            int k=0;
            for(String arr : st){
                if(arr.equals("(")){
                   ++stk;
                }
                else{
                    --stk;
                }
                if(stk < -1) k=1;
            }
            if(stk>-1) k=1;

            if(k==1) System.out.println("NO");
            else System.out.println("YES");
        }
   */
    }
}
