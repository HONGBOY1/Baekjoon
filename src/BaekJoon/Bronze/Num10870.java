package BaekJoon.Bronze;

import java.util.Scanner;

public class Num10870 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 피보나치 수열 출력
        System.out.println(Fibonacci(n));
    }
    // 피보나치 수열의 결과를 구하는 메서드 선언
    public static int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        else return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
