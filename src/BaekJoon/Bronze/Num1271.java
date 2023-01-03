package BaekJoon.Bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Num1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N, M;
        N = sc.nextBigInteger();
        M = sc.nextBigInteger();
        sc.close();
        System.out.println(N.divide(M));
        System.out.println(N.remainder(M));
    }
}
