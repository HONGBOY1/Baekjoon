package BaekJoon.Silver;

import java.math.BigInteger;
import java.util.Scanner;

public class Num1914 {
    static StringBuffer sb = new StringBuffer();

    static void hinoitower(int num, int from, int by, int to) {
        if (num == 1) {
            sb.append(from + " " + to+"\n");
        } else {
            hinoitower(num - 1, from, to, by);
            sb.append(from + " " + to+"\n");
            hinoitower(num - 1, by, from, to);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger k = new BigInteger("2").pow(n).subtract(BigInteger.ONE);
        sb.append(k+"\n");
        if (n <= 20)
            hinoitower(n, 1, 2, 3);

        System.out.println(sb.toString());
    }
}