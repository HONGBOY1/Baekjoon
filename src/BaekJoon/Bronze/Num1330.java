package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1330 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt(),b= sc.nextInt();
        if(a>b) System.out.println(">");
        else if(a<b) System.out.println("<");
        else if(a==b) System.out.println("==");
    }
}
