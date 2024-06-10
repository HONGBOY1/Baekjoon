package BaekJoon.Silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer x[] = new Integer [n];
        int y[] = new int [n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        Arrays.sort(x,Collections.reverseOrder());

        Arrays.sort(y);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += x[i] * y[i];
        }
        System.out.println(sum);

    }
}
