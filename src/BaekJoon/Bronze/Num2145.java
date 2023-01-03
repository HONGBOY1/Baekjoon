package BaekJoon.Bronze;

import java.util.Scanner;

public class Num2145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String num = sc.next();
            if (num.equals("0")) { break; }

            String temp = num;
            while(true) {
                String[] ArrayStrings = temp.split("");
                int sum = 0;
                for (String s : ArrayStrings) { sum += Integer.parseInt(s); }

                temp = String.valueOf(sum);
                if (temp.length() == 1) {
                    System.out.println(sum);
                    break;
                }
            }
        }

    }
}
