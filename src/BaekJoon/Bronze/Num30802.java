package BaekJoon.Bronze;

import java.util.Scanner;

public class Num30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size[] = new int [6];
        for(int i = 0; i < 6; i++) {
            size[i] = sc.nextInt();
        }
        int t= sc.nextInt();
        int p= sc.nextInt();

        int tcnt = 0;

        for (int i = 0; i < 6; i++){
            tcnt += size[i] / t;
            if(size[i] % t != 0) {
                tcnt++;
            }
        }
        System.out.println(tcnt);
        System.out.println(N / p + " " + N % p);
    }
}
