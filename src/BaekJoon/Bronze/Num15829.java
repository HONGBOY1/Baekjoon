package BaekJoon.Bronze;

import java.util.Scanner;

public class Num15829 {
    public static <Char> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        String str= sc.next();
        char[] charArray = str.toCharArray();
        long result = 0;
        long pow = 1;
        for(int i = 0; i < n; i++) {
            result += ((str.charAt(i) - 96) * pow);
            //pow는 31을 매번 곱해준다. 곱해줄때마다 1234567891을 나눠주면 long을 넘지 않을 것이다.
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(result % 1234567891);
    }
}
