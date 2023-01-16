package BaekJoon.Bronze;

import java.util.Scanner;

public class Num26766 {
    public static void main(String[] args) {
        String arr = " @@@   @@@ \n" +
                "@   @ @   @\n" +
                "@    @    @\n" +
                "@         @\n" +
                " @       @ \n" +
                "  @     @  \n" +
                "   @   @   \n" +
                "    @ @    \n" +
                "     @     ";

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(arr);
        }
    }
}
