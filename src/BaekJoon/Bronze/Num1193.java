package BaekJoon.Bronze;

import java.util.Scanner;

public class Num1193 {
    public static void main(String[] args) {
        int cnt = 2, n, max_num = 0;
        Scanner sc = new Scanner(System.in);
        int line = 0;
        n = sc.nextInt();
        while (n > max_num) {
            line += 1;
            max_num += line;
        }

        for (int i = 1; i <= n; i++) {
            if (n > i) {
                n -= i;
                cnt++;
            }
        }
        if (line % 2 == 0) System.out.println(n + "/" + (cnt - n));
        else System.out.println((cnt - n) + "/" + n);
    }

}

