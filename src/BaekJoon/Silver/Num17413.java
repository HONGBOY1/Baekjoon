package BaekJoon.Silver;


import java.util.Scanner;
import java.util.Stack;

public class Num17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        String str = sc.nextLine();
        String arr[] = str.split("");
        boolean inout=false;
        for(String strarr  : arr){
            if(strarr.equals("<")){
                inout=true;
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(strarr);
            }
            else if(strarr.equals(">")){
                inout=false;
                System.out.print(strarr);
            }
            else if(inout){
                System.out.print(strarr);
            }
            else if(!inout){
                if(strarr.equals(" ")) {
                    while (!stack.isEmpty()){
                        System.out.print(stack.pop());
                    }
                    System.out.print(strarr);
                }
                else{
                    stack.push(strarr);
                }

            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }


    }
}
