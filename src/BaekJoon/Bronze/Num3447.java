package BaekJoon.Bronze;

import java.util.Scanner;

public class Num3447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            String str = input.replace("BUG", "");

            for (; ; ) {
                if (input.equals(str)){
                    System.out.println(str);
                    break;
                 }
                input = str;
                str = str.replace("BUG", "");
            }
        }

    }
}
