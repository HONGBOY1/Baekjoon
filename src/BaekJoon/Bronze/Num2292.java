package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int cnt=2;
        if (n == 1) {
            System.out.print(1);
        }

        else {
            while (cnt <= n) {
                cnt = cnt + (6 * r);
                r++;
            }
            System.out.print(r);
        }
    }
}
