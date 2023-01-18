package BaekJoon.Bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Num2935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = new BigInteger(sc.next());
        String str =sc.next();
        BigInteger y = new BigInteger(sc.next());
        System.out.println(str.equals("+") ?  x.add(y): x.multiply(y));
    }
}
