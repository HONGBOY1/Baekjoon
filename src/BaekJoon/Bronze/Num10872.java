package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if(n<=1) return 1;
        else return factorial(n-1)*n;
    }
}