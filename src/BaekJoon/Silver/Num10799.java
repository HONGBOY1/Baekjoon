package BaekJoon.Silver;

import java.util.Scanner;
import java.util.Stack;

public class Num10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        String str=sc.next();
        String[] arr = str.split("");
        int sum=0;
        for(int i=0; i<str.length(); i++){
            if(arr[i].equals("(")){
                stack.push(arr[i]);
            }
            else{
                stack.pop();
                if(arr[i-1].equals("(")){
                    sum+=stack.size();
                }
                else{
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
