package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int sum=0;
        for(int i=0; i<N; i++) {
            int a= sc.nextInt(), b= sc.nextInt();
            double result = Math.pow(a, b);
            sum=(int)result;
            System.out.println(sum%10);
        }
    }
}
