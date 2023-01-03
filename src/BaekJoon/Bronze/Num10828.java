package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Num10828  {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] str = br.readLine().split(" ");
            if(str[0].equals("push")){
                stack.push(Integer.parseInt(str[1]));
            }
            if(str[0].equals("top")){
                if(stack.empty()){
                    System.out.println(-1);
                }
                else System.out.println(stack.peek());
            }
            if(str[0].equals("size")){
                System.out.println(stack.size());
            }
            if(str[0].equals("empty")){
                if(stack.empty()){
                    System.out.println(1);
                }
                else System.out.println(0);
            }
            if(str[0].equals("pop")){
                if(stack.empty()) {
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack.peek());
                    stack.pop();
                }
            }

        }
    }
}
