package BaekJoon.Bronze;

import java.util.Scanner;

public class Num26561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 1; j <= t; j++) {
                if(j%7==0){
                    p--;
                }
                if(j%4==0){
                    p++;
                }
            }
            System.out.println(p);
        }

    }
}
